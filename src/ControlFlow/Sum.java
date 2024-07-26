package ControlFlow;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int number = 25;
        int i;
        for (i = 1; i < number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("print Sum of even numbers" + sum);
    }
}

