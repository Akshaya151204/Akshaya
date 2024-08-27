package src;

import java.util.Scanner;

public class Arraywords {
    public static void main(String[] args) {
        String[] words = {"apple", "application", "banana", "appreciate", "pineapple"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first and the Last two letters: ");
        String firstTwo = scanner.next();
        String secondTwo = scanner.next();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.substring(0,2).equals(firstTwo) && word.substring(word.length()-2).equals(secondTwo)){
                System.out.println(word);
            }
        }
    }
}

