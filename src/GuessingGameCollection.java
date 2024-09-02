package src;
import java.util.Arrays;
import java.util.Set;
import java.lang.String;
import java.util.Scanner;
import java.util.HashSet;


public class GuessingGameCollection {
    public static void main(String[] args) {
        Set<Integer> boxA = new HashSet<>(Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15));
        Set<Integer> boxB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 12, 13, 14, 15));
        Set<Integer> boxC = new HashSet<>(Arrays.asList(2, 3, 6, 7, 10, 11, 14, 15));
        Set<Integer> boxD = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));
        Set<Integer> numbersLimit = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        Set<Integer>[] Boxes = new Set[]{boxA, boxB, boxC, boxD};
        System.out.println("Think of the number from 1 to 15:");
        GuessingGameCollection guessingGameCollection = new GuessingGameCollection();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Boxes.length; i++) {
            System.out.print(" Is your number in box " + (char) ('A' + i) + "? Yes / No:");
            String guessed = scanner.nextLine();
            if (guessed.equalsIgnoreCase("yes"))
                numbersLimit.retainAll(Boxes[i]);
            else if (guessed.equalsIgnoreCase("no"))
                numbersLimit.removeAll(Boxes[i]);
            else
                System.out.println("Input should be only yes or no");
        }
        if (numbersLimit.size() == 1)
            System.out.println(numbersLimit);
        else
            System.out.println("The number is not between 1 to 15");
    }
}







