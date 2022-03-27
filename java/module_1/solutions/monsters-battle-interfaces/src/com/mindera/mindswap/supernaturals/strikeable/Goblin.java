package com.mindera.mindswap.supernaturals.strikeable;

import com.mindera.mindswap.supernaturals.Supernatural;
import com.mindera.mindswap.supernaturals.SupernaturalType;
import com.mindera.mindswap.util.Messages;

public class Goblin extends Supernatural implements Strikeable {

    private boolean dead;

    public Goblin(int hitPower) {
        super(hitPower, SupernaturalType.GOBLIN);
    }

    @Override
    public void suffer(int amount) {
        if (getHealth() - amount  <= 0) {
            setHealth(0);
            die();
            System.out.printf(Messages.DEAD_SUPERNATURAL, this);
            return;
        }

        setHealth(getHealth() - amount );
        System.out.printf(Messages.SUPERNATURAL_SUFFER, this, amount, getHealth());
    }

    @Override
    public void die() {
        dead = true;
    }

    @Override
    public boolean isDead() {
        return dead;
    }
}
