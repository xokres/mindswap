package academy.mindswap.exceptions;

public class CardNotInsertedException extends ATMException{
    public CardNotInsertedException() {
        super("Card not inserted");
    }
}
