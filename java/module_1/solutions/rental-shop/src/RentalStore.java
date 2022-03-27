import vehicles.*;

public class RentalStore {
    public final static float gasPrice = 1.43f;
    Vehicle[] vehicles;
    int boughtVehicles;
    int minimumReturnGas;

    public RentalStore(int numberOfVehicles) {
        vehicles = new Vehicle[numberOfVehicles];
        boughtVehicles = 0;
        minimumReturnGas = 20;
    }

    public void addVehicle(Vehicle vehicle) {
        if (boughtVehicles < vehicles.length) {
            for (int i = 0; i < vehicles.length; i++) {
                if (vehicles[i] == null) {
                    vehicles[i] = vehicle;
                    boughtVehicles++;
                    return;
                }
            }
        }
        System.out.println("Could not add more vehicles.");
    }


    public Vehicle rentVehicle(VehicleType vehicleType) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null && vehicles[i].getVehicleType() == vehicleType) {
                Vehicle rented = vehicles[i];
                vehicles[i] = null;
                return rented;
            }

        }
        System.out.println("There are no cars left at this store.");
        return null;
        /*
        switch (type) {
            case CAR:
                return rentCar();
            case HYBRID_CAR:
                return rentHybrid();
            case MOTORCYCLE:
                return rentMotorcycle();
            default:
                System.out.println("There are no vehicles of this type at this store.");
                return null;
        }*/
    }

    public Vehicle rentCar() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof RegularCar) {
                Vehicle rented = vehicles[i];
                vehicles[i] = null;
                return rented;
            }
        }
        System.out.println("There are no cars left at this store.");
        return null;
    }

    public Vehicle rentHybrid() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof HybridCar) {
                Vehicle rented = vehicles[i];
                vehicles[i] = null;
                return rented;
            }
        }
        System.out.println("There are no cars left at this store.");
        return null;
    }

    public Vehicle rentMotorcycle() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Motorcycle) {
                Vehicle rented = vehicles[i];
                vehicles[i] = null;
                return rented;
            }
        }
        System.out.println("There are no motorcycles left at this store.");
        return null;
    }

    public boolean inReturnConditions(Vehicle rented) {
        return rented.getGasLevel() > minimumReturnGas;
    }

    public void returnVehicle(Vehicle rented) {
        String message = "Thank you for your return.";
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = rented;
                if (!inReturnConditions(rented)) {
                    float fuelAmount = rented.refuel();
                    message += " There is a small fee of " + fuelAmount + "euros.";
                }
                System.out.println(message);
                return;
            }
        }
    }
}
