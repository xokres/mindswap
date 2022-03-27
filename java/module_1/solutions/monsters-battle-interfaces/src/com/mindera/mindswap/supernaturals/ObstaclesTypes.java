package com.mindera.mindswap.supernaturals;

public enum ObstaclesTypes {
    WITCH(SupernaturalType.WITCH),
    FAIRY(SupernaturalType.FAIRY),
    GOBLIN(SupernaturalType.GOBLIN);

    SupernaturalType supernaturalType;

    ObstaclesTypes(SupernaturalType supernaturalType) {
        this.supernaturalType = supernaturalType;
    }

    public SupernaturalType getSupernaturalType() {
        return supernaturalType;
    }
}
