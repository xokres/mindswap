package vehicles;

public final class RegularCar extends Car {

    public RegularCar(String model, float gasConsumption) {
        super(model, gasConsumption, VehicleType.CAR);
    }
}
