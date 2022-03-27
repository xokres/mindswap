package com.mindera.mindswap.util;

import com.mindera.mindswap.supernaturals.fairies.Fairy;

public class RandomGenerator {

    public static int generateRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
