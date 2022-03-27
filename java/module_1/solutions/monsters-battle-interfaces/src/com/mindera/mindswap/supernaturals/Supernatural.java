package com.mindera.mindswap.supernaturals;

import com.mindera.mindswap.util.Messages;

public abstract class Supernatural {

    private SupernaturalType type;
    private int hitPower;
    private int health;
    protected int changeMe;

    public Supernatural(int hitPower, SupernaturalType type) {
        this.hitPower = hitPower;
        this.health = 100;
        this.type = type;
    }

    public int attack() {
        System.out.printf(Messages.MONSTER_ATTACK, this);
        return hitPower;
    }

    public int getHealth() {
        return health;
    }

    public int getHitPower() {
        return hitPower;
    }

    public SupernaturalType getType() {
        return type;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return getType().getDescription();
    }
}
