package academy.mindswap.fruits;

import java.util.Objects;

public abstract class Fruit implements Comparable<Fruit> {

    private int acidity;

    public Fruit(int acidity) {
        this.acidity = acidity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Fruit fruit = (Fruit) obj;
        return this.acidity == fruit.acidity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acidity);
    }

    @Override
    public String toString() {
        return "acidity -> " + acidity;
    }

    @Override
    public int compareTo(Fruit o) {
        return acidity - o.acidity;
    }
}
