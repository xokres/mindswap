package vehicles;

public abstract class Car extends Vehicle {
    public Car(String model, float gasConsumption, VehicleType vehicleType) {
        super(model, gasConsumption, vehicleType, 25);
        maxSpeed = 120;
    }
}
