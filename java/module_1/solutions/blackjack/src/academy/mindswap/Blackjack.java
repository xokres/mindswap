package academy.mindswap;



public class Blackjack {

    private static final int MAX_POINTS = 21;

    private static String playerName;
    private static int playerScore;
    private static int playerMaxDifferenceToHold;
    private static boolean isPlayerHolding;

    private static String dealerName;
    private static int dealerScore;
    private static int dealerMaxDifferenceToHold;
    private static boolean isDealerHolding;

    private static Deck deck;
    private static Deck deck2;

    public static void setupGame(String playerName, int playerMaxDifferenceToHold,
                                 String dealerName, int dealerMaxDifferenceToHold) {
        Blackjack.playerName = playerName;
        Blackjack.dealerName = dealerName;
        Blackjack.playerScore = 0;
        Blackjack.dealerScore = 0;
        Blackjack.playerMaxDifferenceToHold = playerMaxDifferenceToHold;
        Blackjack.dealerMaxDifferenceToHold = dealerMaxDifferenceToHold;

        Blackjack.deck = new Deck();
        Blackjack.deck2 = new Deck();
    }

    private static int dealCard() {
        return deck.dealCard();
    }

    public static void playRound() {
        if(willPlayerHold(playerScore, playerMaxDifferenceToHold, dealerScore) ) {
            isPlayerHolding = true;
        }
        if(!isPlayerHolding) {
            playerScore += dealCard();
        }

        if(willPlayerHold(dealerScore, dealerMaxDifferenceToHold, playerScore)) {
            isDealerHolding = true;
        }
        if(!isDealerHolding) {
            dealerScore += dealCard();
        }
    }

    private static boolean willPlayerHold(int currentScore, int maxDifferenceToHold, int otherScore) {
        return (MAX_POINTS - currentScore <= maxDifferenceToHold && currentScore > otherScore) || otherScore > MAX_POINTS;
    }

    public static void printScore() {
        if(isPlayerHolding){
            System.out.printf("Player %s holds at %d\n", playerName, playerScore);
        } else {
            System.out.printf("Player %s: %d\n  ", playerName, playerScore);
        }

        if(isDealerHolding){
            System.out.printf("Dealer %s holds at %d\n", dealerName, dealerScore);
        } else {
            System.out.printf("Dealer %s: %d\n", dealerName, dealerScore);
        }
        System.out.println("");
    }

    public static boolean isGameOver() {
        return playerScore >= MAX_POINTS || dealerScore >= MAX_POINTS || isDealerHolding && isPlayerHolding;
    }

    private static boolean isPlayerWinner() {
        return playerScore <= MAX_POINTS && (playerScore > dealerScore || dealerScore > MAX_POINTS);
    }

    private static boolean isDealerWinner() {
        return dealerScore <= MAX_POINTS && (dealerScore > playerScore || playerScore > MAX_POINTS);
    }

    public static void printWinner(){
        if (isPlayerWinner()) {
            System.out.printf("Player %s wins", playerName);
            return;
        }
        if (isDealerWinner()) {
            System.out.printf("Dealer %s wins", dealerName);
            return;
        }
        System.out.println("Tie");

    }
}
