package com.mindera.mindswap;

import com.mindera.mindswap.factory.MonstersFactory;
import com.mindera.mindswap.monsters.MonsterType;

public class Main {
    public static void main(String[] args) {

       Game game = new Game(new Player("Dan"), new Player("Patrick"));

       game.start(3);

     //   MonstersFactory.create(MonsterType.MUMMY).attack(new Player("Dan").suffer(););


    }
}
