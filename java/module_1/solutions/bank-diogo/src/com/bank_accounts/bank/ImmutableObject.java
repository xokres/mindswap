package com.bank_accounts.bank;

public final class ImmutableObject { //final because you can't extend this class

    private final String name; //final because constant
    private final String surname;
    private String changeMe;

    public ImmutableObject(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setChangeMe(String changeMe) {
        this.changeMe = changeMe;
    }

    public String getChangeMe() {
        return changeMe;
    }
}
