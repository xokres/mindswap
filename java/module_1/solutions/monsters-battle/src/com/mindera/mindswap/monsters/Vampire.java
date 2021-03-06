package com.mindera.mindswap.monsters;

import com.mindera.mindswap.util.Messages;

public class Vampire extends Monster {

    private final double BITING_PROBABILITY = 0.2;
    private final int HEALING_RATE = 10;

    public Vampire() {
        super(20, MonsterType.VAMPIRE);
    }

    @Override
    public int attack() {
        if (Math.random() < BITING_PROBABILITY) {
            bite();
        }
        return super.attack();
    }

    private void bite() {
        if (getHealth() + HEALING_RATE >= 100){
            setHealth(100);
            System.out.println(Messages.VAMPIRE_BITE_FULL_HEALTH);
            return;
        }

        setHealth(getHealth() + HEALING_RATE);
        System.out.printf(Messages.VAMPIRE_BITE, getHealth());
    }
}
