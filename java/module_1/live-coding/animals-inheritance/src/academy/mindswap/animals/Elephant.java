package academy.mindswap.animals;

public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("The person creating this class has no idea of how an elephant sounds.");
    }

    @Override
    public void run(int distanceInKm) {
        super.run(distanceInKm);
        System.out.println("The elephant is running a lot.");
    }


}

