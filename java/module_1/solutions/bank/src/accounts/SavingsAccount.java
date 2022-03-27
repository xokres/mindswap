package accounts;

public class SavingsAccount extends Account {

    private SavingsAccount(int balance, int id) {
        super(balance, "savings", id);
    }



    public static SavingsAccount create(int amount, int id) {
        return new SavingsAccount(amount, id);
    }

    @Override
    public int withdraw(int amount) {
        if (getBalance() - amount <= 0) {
            System.out.println("Not enough funds...");
            return 0;
        }
        super.withdraw(amount);
        return amount;
    }
}
