package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player1 = new Player("John Cruz");
        Player dealer = new Player("Anna Smith");


        Blackjack.setupGame(player1.getName(), 5,
                dealer.getName(),3);

       // Blackjack.setupGame("Diogo", 5,"Marta",3);

        while (!Blackjack.isGameOver()) {
            Casino.playRound();
            Blackjack.playRound();
            Blackjack.printScore();
        }

        Blackjack.printWinner();



    }
}
