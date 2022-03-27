package com.mindera.mindswap;

class Tire {

    private int integrity;
    private double wearAndTearRate;

    public Tire(double wearAndTearRate) {
        this.integrity = 100;
        this.wearAndTearRate = wearAndTearRate;
    }

    public boolean moveAndCheckExplosion(int distance) {
        double totalWearAndTear = distance * wearAndTearRate; 
      
        if (integrity - totalWearAndTear <= 0) { // wearAndTear = 0.05
            return true;
        }
        
        integrity -= totalWearAndTear;
        return false;
    }

    public int getIntegrity(){
        return integrity;
    }

    public void regenerate(){
        integrity = 40;
    }
}