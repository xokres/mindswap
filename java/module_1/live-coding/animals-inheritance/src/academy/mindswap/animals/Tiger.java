package academy.mindswap.animals;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Roar!");
    }
}
