package com.mindera.mindswap.supernaturals.strikeable;

import com.mindera.mindswap.supernaturals.Supernatural;
import com.mindera.mindswap.supernaturals.SupernaturalType;
import com.mindera.mindswap.util.Messages;

public class Witch extends Supernatural implements Strikeable {

    private boolean dead;

    public Witch(int hitPower) {
        super(hitPower, SupernaturalType.WITCH);
    }

    @Override
    public void suffer(int amount) {
        if (getHealth() - (amount / 2) <= 0) {
            setHealth(0);
            die();
            System.out.printf(Messages.DEAD_SUPERNATURAL, this);
            return;
        }

        setHealth(getHealth() - (amount / 2));
        System.out.printf(Messages.SUPERNATURAL_SUFFER, this, amount, getHealth());
    }

    @Override
    public void die(){
        dead = true;
    }

    public boolean isDead() {
        return dead;
    }
}
