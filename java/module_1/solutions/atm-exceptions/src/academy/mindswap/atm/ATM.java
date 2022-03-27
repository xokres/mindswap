package academy.mindswap.atm;

import academy.mindswap.exceptions.*;

public class ATM {

    Card card;
    boolean isCardValidated;

    public void insertCard(Card card) throws CardAlreadyPresent, CardDuplicated {


       if(this.card == card){
           throw new CardDuplicated();
       }

        if(this.card != null && this.card.equals(card)){
            throw new CardDuplicated();
        }
        this.card = card;
        System.out.println("Card inserted");
    }

    public void ejectCard() {
        this.card = null;
        isCardValidated = false;
    }

    public void insertPin(int pin) throws CardNotInsertedException, NotEnoughPermissionsException {
       validateInsertedCard();

        if (card.getPin() != pin) {
            throw new NotEnoughPermissionsException("Wrong pin");
        }
        isCardValidated = true;
    }

    public void withdraw(int amount) throws NotEnoughPermissionsException, NotEnoughBalanceException,
            CardNotInsertedException {

        validateInsertedCard();

        if (!isCardValidated) {
            throw new NotEnoughPermissionsException("Please insert pin first");
        }
        if (card.getBalance() < amount) {
            throw new NotEnoughBalanceException();
        }
        card.setBalance(card.getBalance() - amount);
        System.out.println("Withdrawing " + amount + " balance left " + card.getBalance());
    }

    private void validateInsertedCard() throws CardNotInsertedException {
        if (card == null) {
            throw new CardNotInsertedException();
        }
    }
}
