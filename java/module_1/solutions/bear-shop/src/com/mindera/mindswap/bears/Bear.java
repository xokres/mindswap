package com.mindera.mindswap.bears;

// Every Java class that doesn't explicitly extend another class
// will be implicitly extending the Object Class
public sealed abstract class Bear permits SimpleBear,DrunkBear,CrankyBear {

    private int energy;
    private String type;
    private boolean talkingMode;

    public Bear(String type) {
        energy = 100;
        talkingMode = true;
        this.type = type;
    }

    public void talk() {
        if (canTalk()) {
            loseEnergy();
            System.out.println(this.toString() + ": I love you!");
            checkEnergyLevel();

            return;
        }
        System.out.println(this + ": talking mode is turned off.");
    }

    private void checkEnergyLevel() {
        talkingMode = energy > 0;
    }

    public void loseEnergy() {
        System.out.println(this.die());
        energy -= 20;
    }

    public boolean canTalk() {
        return talkingMode;
    }

    public void turnOffTalkingMode() {
        talkingMode = false;
    }

    public int getEnergy() {
        return energy;
    }

    public abstract String die();

    // toString method is inherited from the Object superclass

   @Override
    public String toString() {
        return type;
    }

    public void turnOnTalkingMode(){
        talkingMode = true;
    };

    public void recharge(){
        energy = 100;
    }

    public Bear stupidMethod(){
     return new CrankyBear();
    }


}

