package com.mindera.mindswap.monsters;

import com.mindera.mindswap.util.Messages;

public abstract class Monster {

    private int hitPower;
    private int health;
    private boolean dead;
    private MonsterType type;

    public Monster(int hitPower, MonsterType type) {
        this.hitPower = hitPower;
        this.type = type;
        health = 100;
        dead = false;
    }

    public int attack() {
        System.out.printf(Messages.MONSTER_ATTACK, this.toString());
        return hitPower;
    }

    public void suffer(int damage) {
        if (health - damage <= 0) {
            health = 0;
            dead = true;
            System.out.printf(Messages.DEAD_MONSTER, this);
            return;
        }

        health -= damage;
        System.out.printf(Messages.MONSTER_SUFFER, this, damage, health);
    }

    public boolean isDead() {
        return this.dead;
    }

    public int getHealth() {
        return health;
    }

    void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return type.getDescription();
    }
}
