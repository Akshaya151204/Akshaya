package New;

public class Savings extends BankAccount {
    double interestrate;
    int principle = 1200;
    int rate = 4;
    int years=2;
    public void interestrate(){
        interestrate = principle * rate * years / 100;
        System.out.println("Interestrate=" + interestrate);
    }
    public static void main(String[] args) {
        Savings savings = new Savings();
        System.out.println("Account number=" + savings.accountNumber);
        savings.deposit(1200);
        savings.withdraw(200);
        savings.interestrate();

    }
}
