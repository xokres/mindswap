package com.mindera.mindswap;

import static com.mindera.mindswap.Translations.*;

public enum GameChoiceEnum {
    ROCK("I'll throw a Rock", new String[]{EN_ROCK, FR_ROCK, PT_ROCK}),
    SCISSORS("I'll cut with a Scissors",new String[]{EN_SCISSORS, FR_SCISSORS, PT_SCISSORS}),
    PAPER("I'll wrap a Paper",new String[]{EN_PAPER, FR_PAPER, PT_PAPER});
    private String name;
    private String[] translations;

    GameChoiceEnum(String name, String[] translations) {
        this.name = name;
        this.translations = translations;
    }


    public String getName() {
        return name;
    }

    public String getTranslations(int language) {
        if(language < 0 || language >= translations.length){
            return "No translation available";
        }
        return translations[language];
    }

    public String getTranslationsEN() {
        return translations[0];
    }

    public String getTranslationsFR() {
        return translations[1];
    }

    public String getTranslationsPT() {
        return translations[2];
    }
}
