package com.mindera.mindswap;

public class RandomGenerator {

    public static int generateRandom(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static int generateRandom(int max) {
       return (int) (Math.random() * max);
    }

}
