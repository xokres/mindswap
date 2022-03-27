package com.mindera.mindswap.supernaturals;

public enum SupernaturalType {
    WEREWOLF("Werewolf"),
    MUMMY("Mummy"),
    VAMPIRE("Vampire"),
    WITCH("Witch"),
    FAIRY("Fairy"),
    GOBLIN("Goblin");

    private final String description;

    SupernaturalType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
