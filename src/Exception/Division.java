package src.Exception;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner divisor = new Scanner(System.in);
        System.out.println("Enter A & B");
        int a=divisor.nextInt();
        int b=divisor.nextInt();
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero"+e);
        }
    }
}

