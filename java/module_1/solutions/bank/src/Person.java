import java.util.Objects;

public class Person {

    private final int WEEKLY_SALARY ;
    private int id;
    private int[] accountIds;
    private Bank bank;
    private boolean card;

    public Person(int weeklySalary) {
        WEEKLY_SALARY = weeklySalary;
        accountIds = new int[2]; //{0,0}
        card = false;
        id = -1;
    }

    public void becomeAClient(Bank bank){
        if(bank == null) {
            System.out.println("Bank is null");
            return;
        }
        if(id != -1) {
            System.out.println("I am already a client of this bank");
            return;
        }
        //this.bank = bank;
        id = bank.createNewClient();
        if(id == -1) {
            System.out.println("Could not create client in bank");
        }

    }

    public void openAccount(Bank bank, String type, int amount) {
        int index = accountIds[0] == 0 ? 0 :
                accountIds[1] == 0 ? 1 : -1;

        if (index == -1) {
            System.out.println("I already have " + accountIds.length + " accounts...");
            return;
        }

        accountIds[index] = bank.createAccount(type, amount, id);
      //  card = !card && accountIds[index] != 0;
    }

    public void transferFunds(Bank bank,int amount, int sourceId, int destId) {
       if(sourceId == destId) {
           System.out.println("You can't transfer money to yourself.");
           return;
       }

        if(accountIds[0] == sourceId && accountIds[1] == destId ||
                accountIds[0] == destId && accountIds[1] == sourceId)
        {
            bank.transfer(amount, sourceId, destId);
            System.out.println("Transfer successful");
            return;
        }
        System.out.println("I don't have that account");


    }

    public void spendMoney(Bank bank ,int amount) {
        if (!card) {
            System.out.println("I need to get myself a card first.");
            return;
        }

        int accountId = getCheckingsAccount(bank);
        if (accountId == -1) {
            System.out.println("I don't have a checkings account. Gee.");
            return;
        }

        bank.withdraw(accountId, amount);
    }

    public void goToWork(Bank bank) {
        int accountId = getCheckingsAccount(bank);
        if (accountId == -1) {
            System.out.println("I don't have a checkings account. Gee.");
            return;
        }

        System.out.println("What a productive working day...");
        bank.deposit(accountId, WEEKLY_SALARY);
    }

    private int getCheckingsAccount(Bank bank) {
        for (int accountId : accountIds) {
            if (bank.checkAccountType(accountId).equals("checkings")) {
                return accountId;
            }
        }
        return -1;
    }

    public int getCombinedBalance(Bank bank) {
        return bank.getBalance(accountIds[0], accountIds[1]);
    }



}
