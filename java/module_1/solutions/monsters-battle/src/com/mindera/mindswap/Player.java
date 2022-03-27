package com.mindera.mindswap;

import com.mindera.mindswap.factory.MonstersFactory;
import com.mindera.mindswap.monsters.*;
import com.mindera.mindswap.util.Messages;
import com.mindera.mindswap.util.RandomGenerator;

public class Player {

    private final String name;
    private Monster[] monsters;
    private boolean lost;

    public Player(String name) {
        this.name = name;
    }

    public void pickMonsters(int numberOfMonsters) {
        monsters = new Monster[numberOfMonsters];
        MonsterType[] monsterTypes = MonsterType.values(); //{WEREWOLF,MUMMY,VAMPIRE};
        MonsterType type;

        for (int i = 0; i < monsters.length; i++) {
            type = monsterTypes[RandomGenerator.generateRandom(0, monsterTypes.length - 1)];
            monsters[i] = MonstersFactory.create(type); // FACTORY DESIGN PATTERN
            System.out.printf(Messages.MONSTER_CREATION, name, monsters[i]);
        }
    }

    public int attack() {
        Monster monster = chooseMonster();
        System.out.printf(Messages.MONSTER_CHOICE, name, monster);
        return monster.attack();
    }

    public void suffer(int damage) {
        Monster monster = chooseMonster();
        System.out.printf(Messages.MONSTER_CHOICE, name, monster.toString());
        monster.suffer(damage);

        if (checkDeadMonsters() == monsters.length) {
            lost = true;
        }
    }

    private Monster chooseMonster() {
        Monster monster = monsters[RandomGenerator.generateRandom(0, monsters.length - 1)];

        if (monster.isDead()) {
            monster = chooseMonster(); // RECURSION
        }

        /*while (monster.isDead()) {
            monster = monsters[RandomGenerator.generateRandom(0, monsters.length - 1)];
        }*/

        return monster;
    }

    private int checkDeadMonsters() {
        int deadMonsters = 0;

        for (Monster monster : monsters) {
            deadMonsters = monster.isDead() ? deadMonsters + 1 : deadMonsters;
        }

        System.out.printf(Messages.DEAD_MONSTER_AMOUNT, name, deadMonsters);
        return deadMonsters;
    }

    public boolean hasLost() {
        return this.lost;
    }

    public String getName() {
        return this.name;
    }
}
