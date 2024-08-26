package src;
public class OverseasBank extends Visa {
    public OverseasBank(String cardNumber, int pin, double balance) {
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