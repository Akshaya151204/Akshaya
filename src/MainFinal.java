package src;
import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {

        IndianBank indianBank = new IndianBank("1111", 1234, 10000.0);
        OverseasBank overseasBank = new OverseasBank("5555", 5678, 20000.0);
        KotakBank kotakBank = new KotakBank("9999", 9876, 30000.0);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your card number: ");
        String cardNumber = scanner.nextLine();

        System.out.print("Enter your pin: ");
        int pin = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your bank name: ");
        String bankName = scanner.nextLine();

        System.out.println("Enter the Requested Amount:");
        double requestedAmount = scanner.nextInt();

        if (bankName.equalsIgnoreCase("IndianBank")) {
            if (indianBank.authenticate(cardNumber, pin)) {
                System.out.println("Authenticated!");
                System.out.println("Balance: " + indianBank.getBalance());
                System.out.println("Requested Amount:" + requestedAmount);
                double balance1 = indianBank.balance - requestedAmount;
                System.out.println("Balance After the requested Amount:" + balance1);
            }
            if (bankName.equalsIgnoreCase("OverseasBank")) {
                if (overseasBank.authenticate(cardNumber, pin)) {
                    System.out.println("Authenticated!");
                    System.out.println("Balance: " + overseasBank.getBalance());
                    System.out.println("Requested Amount:" + requestedAmount);
                    double balance2 = overseasBank.balance - requestedAmount;
                    System.out.println("Balance After the requested Amount:" + balance2);
                }
            }
            if (bankName.equalsIgnoreCase("KotakBank")) {
                if (kotakBank.authenticate(cardNumber, pin)) {
                    System.out.println("Authenticated!");
                    System.out.println("Balance: " + kotakBank.getBalance());
                    System.out.println("Requested Amount:" + requestedAmount);
                    double balance3 = kotakBank.balance - requestedAmount;
                    System.out.println("Balance After the requested Amount:" + balance3);
                }
            }
        }else {
            System.out.println("Invalid user");
        }

    }
}