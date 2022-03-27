package academy.mindswap;

public class Car {

    //State
    private String brand;
    private String color;
    private  int fuelLevel;
    private  String licensePlate;
    private  boolean isRunning;
    private String badVariable;


     public Car( String brand, String color, String licensePlate){
         this.brand = brand;
         this.color = color;
         this.fuelLevel = 100;
         this.licensePlate = licensePlate;
     }

    public Car(String licensePlate, String color) {
        this.brand = brand;
        this.color = color;
        this.fuelLevel = 100;
    }



    //Behavior

    public void accelerate() {
        if(this.fuelLevel <= 0){
            System.out.println("No fuel");
            return;
        }
        this.fuelLevel--;
        System.out.println("Vroom");
    }

    public void getRefuelled(int amount){
         if(amount <=0  || amount > 100){
             System.out.println("Amount can't be less than 1 or more than 100");
             return;
         }
         //this.fuelLevel = amount; //user setter instead
         setFuelLevel(100);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return color;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isRunning() {
        return isRunning;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void setBrand(String brand) {
         this.brand = brand;
    }
}
