package com.mindera.mindswap;

class Car {

    private Engine engine;
    private Tire[] tires;
    private Radio radio;
    private boolean tireSubstitutionNeeded;

    public Car(Engine engine, Tire[] tires, Radio radio) {
        this.engine = engine;
        this.tires = tires;
        this.radio = radio;
        tireSubstitutionNeeded = false;
    }

    // car.accelerate(2);
    public void accelerate(int fuel) {
        int distance = tireSubstitutionNeeded ? 0 : engine.generateEnergy(fuel);

        if (distance == 0) {
            System.out.println("No vrum, vrum for you.");
            return;
        }
        move(distance);
    }

    private void move(int distance) {

        int arrayIndex = 0;
        for (Tire tire : tires) {
            if (tire.moveAndCheckExplosion(distance)) {
                System.out.printf("Your tire %d exploded!\n", arrayIndex);
                this.tireSubstitutionNeeded = true;
                this.radio.turnOn();
                return;
            }
            arrayIndex++;
        }


        System.out.println("Vrum, vrum for " + distance + "km.");
    }

    public void turnOnRadio(){
        radio.turnOn();
    }

    public void refuel() {
        engine.setFuelLevel(100);
        System.out.println("Your tank is full!");
    }

    public void changeTires(double wearAndTearRate) {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tire(wearAndTearRate);
        }
        tireSubstitutionNeeded = false;
        System.out.println("Your tires were changed. Vrum, vrum away!");
    }

    public void changeTires(Tire[] tires) {
        this.tires = tires;
        tireSubstitutionNeeded = false;
        System.out.println("Your tires were changed. Vrum, vrum away!");
    }
}