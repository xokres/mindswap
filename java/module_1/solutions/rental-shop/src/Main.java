import vehicles.*;

public class Main {
    public static void main(String[] args) {

        RentalStore store = new RentalStore(10);
        store.addVehicle(new RegularCar("Yaris", 8));
        store.addVehicle(new Motorcycle("Auris", 6));
        store.addVehicle(new HybridCar("Prius", 6, 2));

        Client john = new Client("John");
        Client anna = new Client("Anna");
        Client ruth = new Client("Ruth");
        john.rentVehicle(store, VehicleType.CAR);
        john.rentVehicle(store, VehicleType.MOTORCYCLE);
        anna.rentVehicle(store, VehicleType.MOTORCYCLE);
        ruth.rentVehicle(store, VehicleType.HYBRID_CAR);


        for (int i = 0; i < 10; i++) {
            if (john.drive(40, 1)) {
                System.out.println("John drove a car");
            } else {
                System.out.println("John did not drove a car");
                john.refuel();
            }

        }

        anna.drive(90, 1);
        ruth.drive(100, 1);
        ruth.drive(20, 1);
        ruth.refuel();

        john.returnVehicle(store);
        anna.returnVehicle(store);
        ruth.returnVehicle(store);
    }
}
