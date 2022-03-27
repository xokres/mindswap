package academy.mindswap.animals;

public class Pig extends Animal {

    public Pig(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Oink, oink, oink.");
    }
}

