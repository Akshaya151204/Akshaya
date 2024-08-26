package src;

import java.util.Date;
import java.util.Scanner;
abstract class Visa {
    String type;
    String ccv;
    Date dateexpirydate;
    String accountholder;
    String cardNumber;
    double requestedAmount;

    int pin;
    double balance;

    public Visa(String cardNumber, int pin, double balance) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
    }

    abstract boolean authenticate(String cardNumber, int pin);
    abstract double getBalance();

    public double withdraw(double amount, String cardNumber, int pin) {
        if (!authenticate(cardNumber, pin)) {
            System.out.println("Invalid user id");
            return 0;
        }
        if (balance < amount) {
            System.out.println("Insufficient balance in your account");
            return 0;
        }
        balance -= amount;
        return amount;

    }
}
