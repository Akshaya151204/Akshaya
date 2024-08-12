package src;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Division1 {
    public static void main(String[] args) {
        Scanner divisor = new Scanner(System.in);
        System.out.println("Enter A & B");

        try {
            int divident = divisor.nextInt();
            int divisor = divisor.nextInt();
            System.out.println(divident / divisor);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        } catch (InputMismatchException ee) {
            System.out.println("Invalid input");
        }
    }
}
