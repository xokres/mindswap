package academy.mindswap;

public class Car {
    private static int numberOfCars = 0;

    private String brand;
    private String color;
    private Engine engine;
    private Radio radio;
    private Tyre tyre;
    private int count;

    public Car(String brand, String color, Engine engine){
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.count++;
        Car.numberOfCars++;
    }

    public Car(String brand, Engine engine){
        this.brand = brand;
        this.engine = engine;
        Car.numberOfCars++;
    }

    public Car(String brand, Tyre tyre, Radio radio, Engine engine){
        this.brand = brand;
        this.radio = radio;
        this.tyre = tyre;
        this.engine = engine;

    }

    public void accelerate(int fuel){
        int distance = engine.generateEnergy(fuel);

        if (distance > 0) {
            System.out.println("Vrum, vrum for " + distance + "km.");
            return;
        }

        System.out.println("No vrum, vrum for you!");
    }

    public void getRefuelled(){
        engine.setFuelLevel(100);
    }

    public String getBrand(String brand){
        return this.brand;
    }

    public String getColor(String color){
        return this.color;
    }

}
