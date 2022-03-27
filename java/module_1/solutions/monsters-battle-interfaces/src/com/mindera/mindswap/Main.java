package com.mindera.mindswap;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new Player("Dan"), new Player("Patrick"));
        game.start(3);
        

    }
}
