package academy.mindswap;

public class MyClass {

    private boolean error = false;

    public void doSomething() throws MyException {
        if (error) {
            throw new MyException("Error");
        }
        System.out.println("Hello World!");
    }
}
