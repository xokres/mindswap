package com.mindera.mindswap;

import com.mindera.mindswap.factory.SupernaturalsFactory;
import com.mindera.mindswap.supernaturals.ObstaclesTypes;
import com.mindera.mindswap.supernaturals.Supernatural;
import com.mindera.mindswap.supernaturals.strikeable.Strikeable;
import com.mindera.mindswap.util.Messages;

public class Game  {

    private final double OBSTACLE_GENERATION_PROBABILITY = 0.3;
    private final Player player1;
    private final Player player2;
    private boolean isGameFinished;
    private boolean generatingObstacle;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        generatingObstacle = false;
    }

    void start(int monstersPerPlayer) {

        System.out.printf(Messages.PLAYER_PICKING, player1.getName());
        player1.createMonsters(monstersPerPlayer);

        System.out.printf(Messages.PLAYER_PICKING, player2.getName());
        player2.createMonsters(monstersPerPlayer);

        System.out.println(Messages.START);

        while (!isGameFinished) {

            if ((generatingObstacle == isGameGeneratingObstacle())) {
                isGameFinished = playerOnObstacleAttack();
                continue;
            }

            isGameFinished = playerOnPlayerAttack();
        }
    }

    private boolean playerOnObstacleAttack() {
        Supernatural supernatural = generateObstacle();

        System.out.printf(Messages.GAME_OBJECT, supernatural.getType());

        player1.suffer(supernatural.getHitPower());
        player2.suffer(supernatural.getHitPower());

        if (checkPlayerLoss(player1) || checkPlayerLoss(player2)) {
            return true;
        }

        if (supernatural instanceof Strikeable) {
            ((Strikeable) supernatural).suffer(player1.attack());
            ((Strikeable) supernatural).suffer(player2.attack());
        }

        return false;
    }

    private boolean checkPlayerLoss(Player player) {

        if (player.isDead()) {
            System.out.printf(Messages.LOSE, player.getName());
            return true;
        }

        return false;
    }

    private Supernatural generateObstacle() {

        ObstaclesTypes obstacle = ObstaclesTypes.values()[(int) (Math.random() * ObstaclesTypes.values().length)];
        return SupernaturalsFactory.create(obstacle.getSupernaturalType());
       // return Math.random() > 0.5 ? SupernaturalsFactory.create(SupernaturalType.FAIRY) :
       //         SupernaturalsFactory.create(SupernaturalType.WITCH);
    }

    private boolean playerOnPlayerAttack() {
        System.out.printf(Messages.HIT, player1.getName());

        player2.suffer(player1.attack());

        if (checkPlayerLoss(player2)) {
            return true;
        }

        System.out.printf(Messages.HIT, player2.getName());
        player1.suffer(player2.attack());

        if (checkPlayerLoss(player1)) {
            return true;
        }

        System.out.println(Messages.NEXT_ROUND);
        return false;
    }

    private boolean isGameGeneratingObstacle() {
        return Math.random() < OBSTACLE_GENERATION_PROBABILITY;
    }
}
