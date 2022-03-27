package academy.mindswap;

public class Main {

    public static void main(String[] args)  {
	// write your code here

        MyClass myClass = new MyClass();

        try {
            myClass.doSomething();
        } catch (Exception e) {
            System.out.println("Exception caught" + e.getMessage());
        }

        SubMain subMain = new SubMain();

        try {
            subMain.callMyClass();
        } catch (MyException e) {
          //  e.printStackTrace();
            System.out.println("MyException caught" + e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Exception caught" + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Out Exception");

    }
}
