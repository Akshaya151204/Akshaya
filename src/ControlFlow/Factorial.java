package ControlFlow;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int i;
        int num=5;
        int sum=0;
        for(i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("factorial of anumber:"+fact);
    }
}
