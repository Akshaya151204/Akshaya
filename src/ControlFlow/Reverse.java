package ControlFlow;

public class Reverse {
    public static void main(String[] args) {
        int num=123;
        int rem;
        int rev=0;
        while(num>0){
            rem=num%10;
            rev=rem+(rev*10);
            num=num/10;
        }
        System.out.println("Reverse of number:"+rev);
    }

}
