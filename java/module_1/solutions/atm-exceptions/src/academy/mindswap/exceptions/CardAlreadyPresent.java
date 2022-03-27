package academy.mindswap.exceptions;

public class CardAlreadyPresent extends ATMException{
    public CardAlreadyPresent() {
        super("Card already present");
    }
}
