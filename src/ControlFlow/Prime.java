package ControlFlow;

public class Prime {
    public static void main(String[] args) {
        int i;
        int j;
        int number = 484;

        for (i = 2; i < number; i++) {
            int count = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(i);
            }
        }
    }
}
