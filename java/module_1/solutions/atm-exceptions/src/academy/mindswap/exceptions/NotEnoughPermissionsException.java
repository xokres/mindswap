package academy.mindswap.exceptions;

public class NotEnoughPermissionsException extends ATMException{
    public NotEnoughPermissionsException(String message) {
        super(message);
    }
}
