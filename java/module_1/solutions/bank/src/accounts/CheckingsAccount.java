package accounts;

public class CheckingsAccount extends Account {

    public CheckingsAccount(int amount, int id) {
        super(amount, "checkings", id);
    }

    @Override
    public int withdraw(int amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Not enough funds...");
            return 0;
        }
        super.withdraw(amount);
        return amount;
    }
}
