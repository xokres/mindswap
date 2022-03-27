package com.mindera.mindswap.factory;

import com.mindera.mindswap.monsters.*;

public class MonstersFactory {

    private MonstersFactory(){
        
    }

    public static Monster create(MonsterType type) {
        switch (type) {
            case WEREWOLF:
                return new Werewolf();
            case MUMMY:
                return new Mummy();
            default:
                return new Vampire();
        }
    }
}
