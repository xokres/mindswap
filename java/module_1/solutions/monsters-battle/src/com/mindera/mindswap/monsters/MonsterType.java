package com.mindera.mindswap.monsters;

public enum MonsterType {
    WEREWOLF("Werewolf"),  //public static final WEREWOLF = new MonsterType("Werewolf");
    MUMMY("Mummy"),
    VAMPIRE("Vampire");

    private String description;

    MonsterType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
