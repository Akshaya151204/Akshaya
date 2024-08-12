package src;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner divisor = new Scanner(System.in);
        System.out.println("Enter A & B");
        int divident=divisor.nextInt();
        int divisor=divisor.nextInt();
        try{
            System.out.println(divident/divisor);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero"+e);
        }
    }
}

