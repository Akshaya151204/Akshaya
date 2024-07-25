package ControlFlow;

public class Prime {
    public static void main(String[] args) {
        int i;
        int number = 484;
        int count=0;
        for (i = 2; i < number; i++) {
            if (count % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime");
        }
    }
}
