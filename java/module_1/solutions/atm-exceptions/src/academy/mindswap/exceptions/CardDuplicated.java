package academy.mindswap.exceptions;

public class CardDuplicated extends ATMException{
    public CardDuplicated() {
        super("Card is the same already inserted");
    }
}
