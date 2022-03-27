package com.mindera.mindswap;

import com.mindera.mindswap.util.Messages;

public abstract class Supernatural {

    private int hitPower;
    private int health;

    public Supernatural(int hitPower) {
        this.hitPower = hitPower;
        health = 100;
    }

    public Supernatural(int hitPower, int health) {
        this.hitPower = hitPower;
        this.health = health;
        //health = 100;
    }

    public int attack() {
        System.out.printf(Messages.MONSTER_ATTACK, this.toString());
        return hitPower;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
