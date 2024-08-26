package src;
public class KotakBank extends Visa {
    public KotakBank(String cardNumber, int pin, double balance) {
        super(cardNumber, pin, balance);
    }
    @Override
    boolean authenticate(String cardNumber, int pin) {
        return this.cardNumber.equals(cardNumber) && this.pin == pin;
    }
    @Override
    double getBalance() {
        return this.balance;
    }
}