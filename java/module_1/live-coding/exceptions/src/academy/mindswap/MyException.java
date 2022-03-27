package academy.mindswap;

public class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }
    public MyException() {
        super("A custom exception");
    }
}
