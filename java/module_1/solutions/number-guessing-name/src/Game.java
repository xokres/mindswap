public class Game {

    private Player p1; // null
    private Player p2; // null

    /*public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }*/

    public void start(int min, int max) {
        System.out.println("STARTING THE GAME...");

        int secretNumber = pickNumber(min, max);
        Player winner = null;

        System.out.println("THIS IS THE NUMBER TO GUESS: " + secretNumber);

        while (winner == null) {
            winner = playGame(min, max, secretNumber);
           // winner = p2;
        }

        printResults(winner);
    }

    private Player playGame(int min, int max, int secretNumber) {
        //secretNumber = 2
        int p1Choice = p1.pickNumber(min, max); //3
        int p2Choice = p2.pickNumber(min, max);//2

        System.out.println(p1.getName() + " picked number: " + p1Choice);
        System.out.println(p2.getName() + " picked number: " + p2Choice);

      /*  if(p1Choice == secretNumber) {
            return p1;
        }

        if(p2Choice == secretNumber) {
            return p2;
        }

        return null;*/
        return p1Choice == secretNumber ? p1 : p2Choice == secretNumber ? p2 : null;
    }

    private int pickNumber(int min, int max) {
        return RandomGenerator.generateRandomNumber(min, max);
    }

    private void printResults(Player winner) {
        System.out.println(winner.getName() + " guessed the correct number and won the game!");
    }

    public void setP1(Player p1){
        this.p1 = p1;
    }

    public void setP2(Player p2){
        this.p2 = p2;
    }
}
