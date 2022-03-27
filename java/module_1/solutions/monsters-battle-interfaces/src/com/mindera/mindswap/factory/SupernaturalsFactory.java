package com.mindera.mindswap.factory;

import com.mindera.mindswap.supernaturals.strikeable.monsters.Mummy;
import com.mindera.mindswap.supernaturals.Supernatural;
import com.mindera.mindswap.supernaturals.SupernaturalType;
import com.mindera.mindswap.supernaturals.fairies.Fairy;
import com.mindera.mindswap.supernaturals.strikeable.Goblin;
import com.mindera.mindswap.supernaturals.strikeable.Witch;
import com.mindera.mindswap.supernaturals.strikeable.monsters.*;

public class SupernaturalsFactory {

    private SupernaturalsFactory() {

    }

    public static Supernatural create(SupernaturalType type) {
        switch (type) {
            case WEREWOLF:
                return new Werewolf(30);
            case MUMMY:
                return new Mummy(10);
            case WITCH:
                return new Witch(15);
            case FAIRY:
                return new Fairy(10);
            case GOBLIN:
                return new Goblin(5);
            default:
                return new Vampire(20);
        }
    }
}
