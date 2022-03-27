package academy.mindswap;

import academy.mindswap.fruits.Apple;
import academy.mindswap.fruits.Fruit;
import academy.mindswap.fruits.Orange;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Apple apple = new Apple(1);


        List<Fruit> fruits = Arrays.asList(
                apple,
                new Apple(0),

                new Orange(3),
                new Orange(2), // DUPE
                new Orange(2),
                new Apple(2),
                apple, // DUPE
                new Orange(3), // DUPE
                new Orange(3), // DUPE
                new Orange(4)
        );

        DupeFinder<Fruit> dupeFinder = new DupeFinder<>(fruits);
        System.out.println(dupeFinder.checkDupes());

        for (Fruit fruit : dupeFinder.getDupes()) {
            System.out.println(fruit);
        }

        for (Fruit fruit : dupeFinder.sortedDupes()) {
            System.out.println(fruit);
        }
    }
}
