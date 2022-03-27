package com.mindera.mindswap.monsters;

import com.mindera.mindswap.util.Messages;

public class Mummy extends Monster {

    private final int MAX_CONSECUTIVE_HITS = 2;
    private final int UNROLL_DAMAGE = 10;
    private int consecutiveHits;

    public Mummy() {
        super(10, MonsterType.MUMMY);
    }


    public void suffer(int damage) {
        consecutiveHits = 0;
        super.suffer(damage);
    }


    @Override
    public int attack() {
        consecutiveHits++;

        if (consecutiveHits == MAX_CONSECUTIVE_HITS) {
            consecutiveHits = 0;
            System.out.println(Messages.MUMMY_UNROLL_PREP);
            return unroll();
        }

        return super.attack();
    }

    private int unroll() {
        setHealth(getHealth() - UNROLL_DAMAGE);
        System.out.printf(Messages.MUMMY_UNROLL, UNROLL_DAMAGE);
        return 0;
    }

}
