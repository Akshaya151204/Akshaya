package Exception;

import java.util.Scanner;

public class AgeException extends Exception{
    AgeException(){
        super("Invalid Age");
    }
    public static void ValidAge(int Age) {
        System.out.println("Valid Age");
    }

    public static void main(String[] args) {
        AgeException ageException=new AgeException();
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter A Number:");
            int Age= scanner.nextInt();
            if (Age < 0 || Age > 120) {
                throw new AgeException();
            }
            ValidAge(Age);
        }catch (AgeException e){
            System.out.println(e.getMessage());
    }
    }
}
