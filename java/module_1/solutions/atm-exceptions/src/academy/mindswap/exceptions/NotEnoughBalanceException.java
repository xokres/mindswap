package academy.mindswap.exceptions;

public class NotEnoughBalanceException extends ATMException{

    public NotEnoughBalanceException() {
        super("Not enough balance to perform this operation");
    }
}
