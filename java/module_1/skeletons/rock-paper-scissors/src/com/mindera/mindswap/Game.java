package com.mindera.mindswap;

import static com.mindera.mindswap.GameMessages.*;

public class Game {

    private final String p1;
    private final String p2;
    private final int language;

    public Game(String p1, String p2) {

        this.p1 = p1;
        this.p2 = p2;
        language = RandomGenerator.generateRandom(3);
    }

    public void start(int maxRounds) {
        System.out.println(language);
        GameChoiceEnum p1Hand;
        GameChoiceEnum p2Hand;
        int p1Wins = 0;
        int p2Wins = 0;
        int roundsPlayed = 0;

        while (roundsPlayed < maxRounds) {

            p1Hand = pickHand();
            p2Hand = pickHand();

            printPicks(p1Hand.getTranslations(language), p2Hand.getTranslations(language));

            if (p1Hand.equals(p2Hand)) {
                System.out.println(GAME_DRAW);
                continue;
            }

            String winner = checkWinner(p1Hand, p2Hand);
            roundsPlayed++;

            if (winner.equals(p1)) {
                p1Wins++;
            } else {
                p2Wins++;
            }

            System.out.printf(GAME_ROUND_WINNER, winner);
        }

        printResults(p1Wins, p2Wins);
    }

    private GameChoiceEnum pickHand() {
      return  GameChoiceEnum.values()[RandomGenerator.generateRandom(GameChoiceEnum.values().length)];
       // return choices[RandomGenerator.generateRandom(choices.length)];
    }

    private void printPicks(String p1Hand, String p2Hand) {
        System.out.printf(PLAYER_PICKED, p1, p1Hand);
        System.out.printf(PLAYER_PICKED, p2, p2Hand);
       // System.out.println(p2 + " picked: " + p2Hand + ".");
    }

    //Singleton

    private String checkWinner(GameChoiceEnum p1Hand, GameChoiceEnum p2Hand) {
        String winner = p1;

        switch (p1Hand) {
            case ROCK:
                if (p2Hand == GameChoiceEnum.PAPER) {
                    winner = p2;
                }
                break;
            case PAPER:
                if (p2Hand == GameChoiceEnum.SCISSORS) {
                    winner = p2;
                }
                break;
            case SCISSORS:
                if (p2Hand == GameChoiceEnum.ROCK) {
                    winner = p2;
                }
                break;
        }

        return winner;
    }


    private void printResults(int p1Wins, int p2Wins) {
        String winnersName = p1Wins == p2Wins ? "No one. It's a tie!" :
                p1Wins > p2Wins ? p1 : p2;

        System.out.println("==============================");
        System.out.println("AND THE WINNER OF THE GAME IS: ");
        System.out.println(winnersName);
    }
}
