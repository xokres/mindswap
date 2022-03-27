package com.mindera.mindswap.bears;



public final class DrunkBear extends Bear {

    private final double FALL_ASLEEP_PROBABILITY = 0.2;
    private boolean asleep;

    public DrunkBear() {
        super(BearTypes.DRUNK_BEAR);
        asleep = false;
    }

    @Override
    public void talk() {
        if (Math.random() < FALL_ASLEEP_PROBABILITY || !canTalk()) {
            turnOffTalkingMode();
            snore();
            return;
        }
        super.talk();
    }

    @Override
    public String die() {
        return "Drunk stuff";
    }

    // helper method
    private void snore() {
        System.out.println(this + ": zzzzzzzzz...");
    }

    @Override
    public void recharge(){
        if(!asleep){
            System.out.println("you can't recharge because you're not asleep");
            return;
        }

        turnOnTalkingMode();
        super.recharge();
    }
}
