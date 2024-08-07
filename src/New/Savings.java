package New;

public class Savings extends BankAccount {
    double interestrate;
    public void interestrate(double principle,int rate,int years){
        interestrate = principle * rate * years / 100;
        System.out.println("Interestrate=" + interestrate);
    }
    public static void main(String[] args) {
        Savings savings = new Savings();
        System.out.println("Account number=" + savings.accountNumber);
        savings.deposit(1200);
        savings.withdraw(200);
        savings.interestrate(1200,4,2);

    }
}
