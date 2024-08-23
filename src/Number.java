package src;

import java.util.Scanner;

public class Number {
    public int numberOrder(int first, int sec, int third) {
        if (first < sec && first < third)
            System.out.println("Increasing Order");
        else if (first > sec && first > third)
            System.out.println("Decrasing Order");
        else
            System.out.println("Neither Decrasing Nor Increasing");
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three Numbers:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        Number number=new Number();
        number.numberOrder(firstNumber,secondNumber,thirdNumber);
    }
}








