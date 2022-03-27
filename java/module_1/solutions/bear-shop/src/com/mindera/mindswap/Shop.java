package com.mindera.mindswap;

import com.mindera.mindswap.bears.Bear;
import com.mindera.mindswap.bears.CrankyBear;
import com.mindera.mindswap.bears.DrunkBear;
import com.mindera.mindswap.bears.SimpleBear;

public class Shop {


    private int bearsCreated;

    public Bear createBear() {

        bearsCreated++;

        if (bearsCreated % 5 == 0) {
            return new CrankyBear();
        }

        if (bearsCreated % 2 == 0) {
            return new SimpleBear();
        }

        return new DrunkBear();
    }

    public boolean compare(Shop shop) {
        return  this.bearsCreated > shop.bearsCreated;
    }

    /*public Shop compare(Shop shop){
        return bearsCreated > shop.bearsCreated ? this : shop;
    }*/
}
