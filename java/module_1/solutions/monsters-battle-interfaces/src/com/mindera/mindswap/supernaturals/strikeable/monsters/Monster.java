package com.mindera.mindswap.supernaturals.strikeable.monsters;

import com.mindera.mindswap.supernaturals.Supernatural;
import com.mindera.mindswap.supernaturals.SupernaturalType;
import com.mindera.mindswap.supernaturals.strikeable.Strikeable;
import com.mindera.mindswap.util.Messages;

public abstract class Monster extends Supernatural implements Strikeable {

    private boolean dead;

    public Monster(int hitPower, SupernaturalType type) {
        super(hitPower, type);
    }

    @Override
    public void suffer(int damage) {
        if (getHealth() - damage <= 0) {
            setHealth(0);
            die();
            System.out.printf(Messages.DEAD_SUPERNATURAL, this);
            return;
        }

        setHealth(getHealth() - damage);
        System.out.printf(Messages.SUPERNATURAL_SUFFER, this, damage, getHealth());
    }

    @Override
    public void die(){
        dead = true;
    }

    public boolean isDead() {
        return dead;
    }
}
