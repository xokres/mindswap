import accounts.Account;
import accounts.CheckingsAccount;
import accounts.SavingsAccount;

public class Bank {

    private final int MINIMUM_AMOUNT_TO_OPEN_SAVINGS;
    private Account[] accounts;
    private int[] clientIds;
    private int nextAccountId;

    public Bank(int maximumAccounts) {
        accounts = new Account[maximumAccounts];  //{null,null,null}
        clientIds = new int[maximumAccounts / 2]; //{0,0,0}
        nextAccountId = 0;
        MINIMUM_AMOUNT_TO_OPEN_SAVINGS = 100;
    }

    public int createNewClient() {

        for (int i = 0; i < clientIds.length; i++) {
            if (clientIds[i] == 0) {
                clientIds[i] = i == 0 ? 1 : clientIds[i-1] + 1;  // {0,0,0} {1,0,0}  {1,2,0}   {1,2,3}
                int id = clientIds[i];
                System.out.println("Welcome to our bank. Here's your id: " + id);
                return id;
            }
        }
        return -1;
    }

    public int createAccount(String type, int amount, int id) {

        if (!checkIfAccountCanBeCreated(type, amount, id)) {
            return 0;
        }

        accounts[nextAccountId] = type.equals("checkings") ?
                new CheckingsAccount(amount, id) : SavingsAccount.create(amount, id);

        accounts[nextAccountId].setId(++nextAccountId);
        System.out.println("Account with id " + nextAccountId + " successfully created!");
        return nextAccountId;
    }

    private boolean checkIfAccountCanBeCreated(String type, int amount, int id) {

        if (id == -1) {
            System.out.println("You're not a customer here. Bye.");
            return false;
        }

        if (checkCreationLimitReached()) {
            System.out.println("We're full, here. No more account creating space.");
            return false;
        }

        if (type.equals("savings") && amount < MINIMUM_AMOUNT_TO_OPEN_SAVINGS) {
            return false;
        }

        return true;
    }

    private boolean checkCreationLimitReached() {
        return accounts.length == nextAccountId; // works because we're not contemplating the closing of accounts
    }

    public String checkAccountType(int accountId) {
        if (accountId > accounts.length || accountId <= 0) {
            return "invalid";
        }

        int index = accountId - 1;
        return accounts[index].getType();
    }

    public void deposit(int accountId, int amount) {
        int index = accountId - 1;
        accounts[index].deposit(amount);
    }

    public void withdraw(int accountId, int amount) {
        int index = accountId - 1;
        accounts[index].withdraw(amount);
    }

    public void transfer(int amount, int sourceId, int destId) {
        int sourceIndex = sourceId - 1;
        int destIndex = destId - 1;

        if (!checkIfTransferIsLegal(accounts[sourceIndex], accounts[destIndex])) {
            return;
        }

        doTransfer(amount, accounts[sourceIndex], accounts[destIndex]);
    }

    private void doTransfer(int amount, Account srcAccount, Account destAccount) {
        int effectiveAmount = srcAccount.withdraw(amount);
        destAccount.deposit(effectiveAmount);
    }

    private boolean checkIfTransferIsLegal(Account srcAccount, Account destAccount) {

        if (srcAccount.getClientId() != destAccount.getClientId()) {
            System.out.println("Multi-client tranfers aren't allowed. Yet.");
            return false;
        }

        if (srcAccount.getType().equals("savings") && !destAccount.getType().equals("checkings")) {
            System.out.println("You need to transfer from a savings account to a checkings account.");
            return false;
        }
        return true;
    }

    public int getBalance(int accountId, int accountId2) {
        int accIndex = accountId - 1;
        int accIndex2 = accountId2 - 1;
        return accounts[accIndex].getBalance() + accounts[accIndex2].getBalance();
    }
}
