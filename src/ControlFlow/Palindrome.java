package ControlFlow;

public class Palindrome {
    public static void main(String[] args) {
        String[] a = {"racecar", "madam", "man", "question"};
        String b;
        char ch;
        for (int i = 0; i < 4; i++) {
            b = "";
            for (int j = 0; j < a[i].length(); j++) {
                ch = a[i].charAt(j);
                b = ch + b;
            }
            if (a[i].equals(b)) {
                System.out.println("Palindrome:" + a[i]);
            }
        }
    }
}
