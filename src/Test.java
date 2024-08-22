package src;

import java.util.Scanner;
public class Test {

    public void numberWords(int number, String character) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number > 19) {
            System.out.print(tens[number / 10] + " " + units[number % 10]);
        } else {
            System.out.print(units[number]);
        }
        if (number > 0) {
            System.out.print(character);
        }
    }
    public void converWords2(int number) {
        if (number / 100000 > 0) {
            numberWords(number / 100000, " Lakh ");
            number =number% 100000;
        }
        if (number / 1000 > 0) {
            numberWords(number / 1000, " Thousand ");
            number %= 1000;
        }
        if (number / 100 > 0) {
            numberWords(number / 100, " Hundred ");
            number %= 100;
        }
        if (number > 0) {
            numberWords(number, "");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to be changed into words:");
        int numberWords = scanner.nextInt();
        Test test = new Test();
        if (numberWords > 100000 || numberWords <= 0) {
            System.out.print("Enter number wihin 1 to one lakh");

        } else {
            test.converWords2(numberWords);
        }
    }
}


