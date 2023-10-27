/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package moocfihelsinki;

import main.java.moocfihelsinki.account.Account;
import main.java.moocfihelsinki.whistle.Whistle;
import main.java.moocfihelsinki.whistle;
import main.java.moocfihelsinki.whistle;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //Your first account 
        var testAccount = new Account(100.00);
        System.out.println("Initial balance: " + testAccount.getBalance().toString());
        testAccount.deposit(20.00);
        System.err.println("After deposit balance:" + testAccount.getBalance().toString());
        // Your first bank transfer
        var MatthewsAccount = new Account(1000.000);
        var MyAccount = new Account(0.0);
        MatthewsAccount.withdraw(100.00);
        MyAccount.deposit(10.00);
        System.out.println("Matthew account funds: " + MatthewsAccount.getBalance().toString());
        System.out.println("My Account funds: " + MyAccount.getBalance().toString());
        // Whistle
        var whistle = new Whistle("Kvaak");
        whistle.sound();

    }
}
