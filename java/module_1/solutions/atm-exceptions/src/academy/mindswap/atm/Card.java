package academy.mindswap.atm;

public class Card {
    private int pin;
    private int balance;

    public Card(int pin, int balance) {
        this.pin = pin;
        this.balance = balance;
    }

    int getPin() {
        return pin;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }
}
