package ControlFlow;

public class Factorial {
    public static void main(String[] args) {
        int i=0;
        int fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of a given number:"+fact);

    }
}

