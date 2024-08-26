package src;
public class IndianBank extends Visa {
    public IndianBank(String cardNumber, int pin, double balance) {
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