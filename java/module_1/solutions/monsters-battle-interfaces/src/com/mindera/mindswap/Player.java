package com.mindera.mindswap;

import com.mindera.mindswap.factory.SupernaturalsFactory;
import com.mindera.mindswap.supernaturals.Supernatural;
import com.mindera.mindswap.supernaturals.strikeable.Strikeable;
import com.mindera.mindswap.supernaturals.strikeable.monsters.Monster;
import com.mindera.mindswap.supernaturals.SupernaturalType;
import com.mindera.mindswap.util.Messages;
import com.mindera.mindswap.util.RandomGenerator;

public class Player implements Strikeable {

    private String name;
    private Monster[] monsters;
    private boolean lost;

    public Player(String name) {
        this.name = name;
    }

    public void createMonsters(int monstersPerPlayer) {
        monsters = new Monster[monstersPerPlayer];
        Supernatural supernatural;

        for (int i = 0; i < monsters.length; i++) {
            supernatural = generateSupernaturalBeing();

            while (!(supernatural instanceof Monster)) {
                supernatural = generateSupernaturalBeing();
            }
            monsters[i] = (Monster) supernatural;
            System.out.printf(Messages.MONSTER_CREATION, name, monsters[i]);
        }
    }

    private Supernatural generateSupernaturalBeing() {
        return SupernaturalsFactory.create(SupernaturalType.values()[(int) (Math.random() * SupernaturalType.values().length)]);
    }

    public int attack() {
        return chooseMonster().attack();
    }

    @Override
    public void suffer(int damage) {
        Monster monster = chooseMonster();
        System.out.printf(Messages.MONSTER_CHOICE, name, monster);
        monster.suffer(damage);
        if (checkDeadMonsters() == monsters.length) {
            die();
        }

    }

    private Monster chooseMonster() {
        Monster monster = monsters[RandomGenerator.generateRandom(0, monsters.length - 1)];

        if (monster.isDead()) {
            monster = chooseMonster(); // RECURSION
        }

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


    public String getName() {
        return this.name;
    }


    @Override
    public void die() {
        lost = true;
    }

    @Override
    public boolean isDead() {
        return lost;
    }
}
