package Exception;


import java.util.Scanner;

public class Square {
        public static void Squareroot(int number){
            System.out.println("Square root of Given Number: "+Math.sqrt(number));
        }
        public static void main(String[] args) {
            Square square=new Square();
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter A Number:");
                int number= scanner.nextInt();
                if(number<0){
                    throw new IllegalArgumentException();
                }
                else {
                    Square.Squareroot(number);
                }
            } catch (IllegalArgumentException exc) {
                System.out.println("No negative numbers");
            }
        }
    }