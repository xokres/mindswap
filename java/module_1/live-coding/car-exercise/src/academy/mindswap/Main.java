package academy.mindswap;

public class Main {

    public static void main(String[] args) {


             // Create a new instance of the class or object
        String brand = "Tata";
        String brand1 = new String("Tata");

        Car car = new Car(brand, "Fuscia", "AA27RR");
        Car car1 = new Car(brand1,  "Fuscia");

        System.out.println(car.getBrand());
        String car1Brand = car1.getBrand();
        car.setBrand(car1.getBrand());

        car1.setBrand("Rover");

        System.out.println(car.getBrand());

        //I'm setting the licence plate to blavla
        car.setLicensePlate("AA27RF");

         //  System.out.println(car.fuelLevel); Error private property

       // car.fuelLevel = 100; Error private property
         car.getRefuelled(100);

        //Method call
        car.accelerate();
        System.out.println("The car fuel level is: " + car.getFuelLevel());

        car.accelerate();
        System.out.println("The car fuel level is: " + car.getFuelLevel());



    }
}
