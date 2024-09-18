package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division2 {
    public static void main(String[] args) {
        Scanner divisor = new Scanner(System.in);
        System.out.println("Enter A & B");

        try {
            int Divident = divisor.nextInt();
            int Divisor = divisor.nextInt();
            System.out.println(Divident / Divisor);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        } catch (InputMismatchException ee) {
            System.out.println("Invalid input");
        }
    }
}
