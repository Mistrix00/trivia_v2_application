package net.mistrix;

import net.mistrix.banking.Bank;
import net.mistrix.banking.Person;
import net.mistrix.trivia.TriviaGame;

public class Main {
    public static void main(String[] args) {
        
        Person nano = new Person("Nano", "Attack", 8);
        Person daniel = new Person("Daniel", "Smith", 24);
        Person marie = new Person("Marie", "Susan", "Jones", 28);

        Bank mb = new Bank("MistrixBanking");
        mb.openBankAccount(nano, 200); // Not old Enough

        mb.openBankAccount(marie, 2000);
        mb.openBankAccount(daniel, 10); // Deposit is not enough

        System.out.println(mb.getAccountByPerson(marie).getBalance()); // 2000
        mb.withdrawAmount(3000, marie); // Cannot withdraw over the limit!



        // Uncomment both to play game!
        // TriviaGame game = new TriviaGame();
        // game.startGame();

    }
}
