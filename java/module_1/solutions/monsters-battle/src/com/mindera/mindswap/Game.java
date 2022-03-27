package com.mindera.mindswap;

import com.mindera.mindswap.util.Messages;

public class Game {

    private Player player1;
    private Player player2;
    private boolean finished;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(int monstersPerPlayer) {
        finished = false;

        System.out.printf(Messages.PLAYER_PICKING, player1.getName());
        player1.pickMonsters(monstersPerPlayer);

        System.out.printf(Messages.PLAYER_PICKING, player2.getName());
        player2.pickMonsters(monstersPerPlayer);

        System.out.println(Messages.START);

        Player attacker = player1;
        Player defender = player2;


        while (!finished) {

            System.out.printf(Messages.HIT, attacker.getName());

            defender.suffer(attacker.attack());

            if (defender.hasLost()) {
                System.out.printf(Messages.LOSE, defender.getName());
                finished = true;
                return;
            }

           /* System.out.printf(Messages.HIT, defender.getName());
            attacker.suffer(defender.attack());

            if ( attacker.hasLost()) {
                System.out.printf(Messages.LOSE,   attacker.getName());
                finished = true;
                return;
            }*/

            // Swap attacker and defender
            Player temp = attacker;

            attacker = defender;
            defender = temp;


            System.out.println(Messages.NEXT_ROUND);

        }
    }

}
