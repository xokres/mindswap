package academy.mindswap.fruits;

public class Orange extends Fruit {
    public Orange(int acidity) {
        super(acidity);
    }

    @Override
    public String toString() {
        return "ORANGE - " + super.toString();
    }
}
