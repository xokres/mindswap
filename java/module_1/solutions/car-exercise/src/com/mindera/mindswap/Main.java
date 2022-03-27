package com.mindera.mindswap;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();
        Radio radio = new Radio();
        Tire[] tires = {
                new Tire(0.03),
                new Tire(0.05),
                new Tire(0.02),
                new Tire(0.04)
        };

        Tire[] substitutionTires = {
                new Tire(0.03),
                new Tire(0.05),
                new Tire(0.02),
                new Tire(0.04)
        };

        Car car = new Car(engine, tires, radio);
        car.accelerate(2);

        car.accelerate(98);
        car.refuel();
        car.accelerate(100);
        car.refuel();
        car.accelerate(100);
        car.refuel();
        car.turnOnRadio();
        //car.changeTires(0.05);
        car.changeTires(substitutionTires);
        car.accelerate(100);

        for (Tire tire /*tire == tires[i]*/: tires){
            System.out.println(tire.getIntegrity());
        }
    }
}