package New;

public class BankAccount {
    protected int accountNumber = 12345;
    protected int balance = 100000;

    protected int deposit(int amount) {
        balance = balance + amount;
        System.out.println("Balance after depositing = " + balance);
        return balance;
    }
    protected int withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance amount=" + balance);
        } else {
            System.out.println("No balance in the account");
            return balance;
        }
        return amount;
    }
}

