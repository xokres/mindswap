package com.mindera.mindswap;

import com.mindera.mindswap.bears.Bear;
import com.mindera.mindswap.bears.BearTypes;
import com.mindera.mindswap.bears.CrankyBear;

public class Main{
    public static void main(String[] args) {
        Shop shop = new Shop();



        Bear[] bears = new Bear[5]; //{null, null, null, null, null};

        for (int i = 0; i < bears.length; i++) {
            bears[i] = shop.createBear(); //{DrunkBear 0xFFF1, Simple, DrunkBear 0xFFF4, Simple, CrankyBear};
        }

        for (Bear bear : bears) {
            while (bear.canTalk()) {
              //  System.out.println(bear.getClass().getName());
                bear.talk();
                if (bear instanceof CrankyBear) {
                    ((CrankyBear) bear).sing();
                }
            }

        }

        Shop shop2 = new Shop();
        Shop shop3 = new Shop();

        System.out.println(shop.compare(shop2));
        System.out.println(shop3.compare(shop2));

    }
}
