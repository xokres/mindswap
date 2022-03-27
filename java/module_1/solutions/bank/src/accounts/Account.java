package accounts;

public abstract class Account {

    private int balance;
    private String type;
    private int id;
    private int clientId;

    public Account(int balance, String type, int clientId) {
        this.balance = balance;
        this.type = type;
        this.clientId = clientId;
    }

    public String getType() {
        return type;
    }


    public void deposit(int amount) {
        balance += amount;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }
}
