package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Engine engine = new Engine();  //-< 0XFFA1
        Engine engine1 = new Engine(5, 80);

        Radio radio = new Radio();
        Tyre tyre = new Tyre();

        Car car = new Car("Tata", new Tyre(), radio,  engine);
        car.accelerate(20);
       // car.accelerate(80);
      //  car.accelerate(10);
        car.getRefuelled();
        //car.accelerate(10);

        Car car1 = new Car("Maruti", new Engine());
        car1.accelerate(20);

    }
}
