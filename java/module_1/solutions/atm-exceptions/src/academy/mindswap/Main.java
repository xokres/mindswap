package academy.mindswap;

import academy.mindswap.atm.ATM;
import academy.mindswap.atm.Card;
import academy.mindswap.exceptions.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ATM atm = new ATM();
        Card card = new Card(1111,1000);
        Card card2 = new Card(1111,1000);
        int pinToStart= 1000;

      /*  try {
            atm.insertCard(card);
            while (true) {
                System.out.println("Enter your pin");
                try {
                    atm.insertPin(pinToStart);
                    System.out.println("insert pin");
                }   catch (ATMException e) {
                    pinToStart++;
                    System.out.println("Invalid pin");
                    continue;
                }
                System.out.println("Out of loop");
                break;
            }
            System.out.println("The pin is: " + pinToStart);
        } catch (CardDuplicated | CardAlreadyPresent e) {
            System.out.println(e.getMessage());
        }*/

       try {
           atm.insertCard(card);
           atm.insertCard(card);
           atm.insertPin(1111);
        } catch (ATMException e) {
               try {
                   atm.insertPin(1111);
                   atm.withdraw(100);
               } catch (CardNotInsertedException ex) {
                   ex.printStackTrace();
               } catch (NotEnoughPermissionsException ex) {
                   ex.printStackTrace();
               } catch (NotEnoughBalanceException notEnoughBalanceException) {
                   notEnoughBalanceException.printStackTrace();
               }

           System.out.println(e.getMessage());
        } finally {
            System.out.println("Will execute with or without exception");
       }


/*
        try {
            atm.insertCard(card);
            atm.insertCard(card);

            //not going to execute the following lines
            System.out.println("Not going to execute the following lines");
            atm.insertPin(1111);
            } catch (CardAlreadyPresent | CardDuplicated e) {
                System.out.println(e.getMessage());
            } catch (NotEnoughPermissionsException | CardNotInsertedException e) {
                e.printStackTrace();
            }

        try {
            atm.withdraw(100);
            atm.insertPin(1111);
            atm.withdraw(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            atm.insertPin(1111);
            atm.withdraw(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
*/

    }
}
