public class Bankaccount {
    private String accountnumber;
    private double balance;

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void deposit(double amount) {
        double dep = balance + amount;
        System.out.println("New balance after depositing:" + dep);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            double withdrawAmount = balance - amount;
            System.out.println("Withdraw is sucessful. New balance is " + withdrawAmount);
        } else {
            System.out.println("You do not have sufficient balance to withdraw.");
        }
    }
}