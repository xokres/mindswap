package academy.mindswap.fruits;

public class Apple extends Fruit {
    public Apple(int acidity) {
        super(acidity);
    }

    @Override
    public String toString() {
        return "APPLE - " + super.toString();
    }
}
