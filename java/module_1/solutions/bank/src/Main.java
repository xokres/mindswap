import accounts.Account;

public class Main {

    public static void main(String[] args) {

        Bank santander = new Bank(10);
        Bank creditSuisse = new Bank(10);
        Person kyle = new Person(300);




        kyle.becomeAClient(null);
        kyle.becomeAClient(creditSuisse);
        kyle.goToWork(creditSuisse);
        kyle.openAccount(creditSuisse, "checkings", 100);

        // Creating a savings account with less than minimum amount
        kyle.openAccount(creditSuisse,"savings", 50);

        // Creating savings account
        kyle.openAccount(creditSuisse,"savings", 101);

        // Creating an extra account
        kyle.openAccount(creditSuisse,"checkings", 10);

        kyle.goToWork(creditSuisse);
        System.out.println(kyle.getCombinedBalance(creditSuisse));

        kyle.spendMoney(creditSuisse,200);
        System.out.println(kyle.getCombinedBalance(creditSuisse));

        // Test spending more than I have in my checkings account
        kyle.spendMoney(creditSuisse, 201);
        System.out.println(kyle.getCombinedBalance(creditSuisse));

        kyle.transferFunds(creditSuisse, 100, 2, 1);
        System.out.println(kyle.getCombinedBalance(creditSuisse));

        Person phill = new Person( 300);

        phill.becomeAClient(santander);
        phill.openAccount(santander,"checkings", 100);
        phill.openAccount(santander,"savings", 100);

        //phill.transferFunds(90, 3, 4);

        phill.transferFunds(santander, 10, 2, 1);
    }
}
