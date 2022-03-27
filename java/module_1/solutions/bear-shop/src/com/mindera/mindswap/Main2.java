package com.mindera.mindswap;

import com.mindera.mindswap.bears.Bear;
import com.mindera.mindswap.bears.CrankyBear;
import com.mindera.mindswap.bears.DrunkBear;

public class Main2 {

    public static void main(String[] args) {
      // Bear bear = new Bear("No type");

       Object cranky = new CrankyBear();

        ((CrankyBear) cranky).talk();
        ((Bear) cranky).talk();
        ((CrankyBear)((Bear) cranky)).talk();
     //  Bear cranky2 = new CrankyBear();
    }
}
