package academy.mindswap;

public class Deck {

    private int[] cards;

    public Deck() {
        this.cards = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    }


    public int dealCard() {
        //letra minuscula
        return cards[Utils.generateRandomInt(0, cards.length - 1)];
    }
}
