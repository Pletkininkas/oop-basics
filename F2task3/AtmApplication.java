package com.itacademy.java.oop.basics.F2task3;

import com.itacademy.java.oop.basics.F2task3.exceptions.InsufficientAtmFundsException;
import com.itacademy.java.oop.basics.F2task3.exceptions.NotEnoughBalanceException;
import com.itacademy.java.oop.basics.F2task3.exceptions.NotEnoughCreditException;

public class AtmApplication {

    public static void main(String[] args) {
        Card[] insertedCards = new Card[]{new CreditCard(0, 120, 1000, "Evaldas Grublys", "LT18974561315648975"),
                new DebitCard(1000, "Petras Petraitis", "LT18974561315648976")};
        Atm atm = new MyBankAtm(1200);

        for (Card insertedCard : insertedCards) {
            if (insertedCard instanceof CreditCard) {
                ((CreditCard) insertedCards[0]).setInterest(2);
            }
        }

        try {
            atm.withdraw(insertedCards[0], 1120);
            atm.withdraw(insertedCards[1], 100);
            atm.withdraw(insertedCards[1], 900);
        } catch (NotEnoughBalanceException | NotEnoughCreditException | InsufficientAtmFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            for (Card card : insertedCards) {
                System.out.println(card.toString());
            }
        }
    }
}
