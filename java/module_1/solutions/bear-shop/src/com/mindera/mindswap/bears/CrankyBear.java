package com.mindera.mindswap.bears;
import com.mindera.mindswap.bears.BearTypes;

import static com.mindera.mindswap.bears.BearTypes.CRANKY_BEAR;

public final class CrankyBear extends Bear {

    private boolean singingAbility;

    public CrankyBear() {
        super(CRANKY_BEAR);
        singingAbility = true;
    }

    @Override
    public void talk() {
        if (getEnergy() < 50) {
            turnOffTalkingMode();
            return;
        }
        super.talk();
    }

    @Override
    public String die() {
        return "Raarrrrgh";
    }

    public void sing() {
        if (!singingAbility) {
            System.out.println("I've already sang to you. Bugger off.");
            return;
        }

        System.out.println("People are strange when you're a stranger, faces look ugly when you're alone...");
        singingAbility = false;
    }
}
