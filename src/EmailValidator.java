package src;
import java.lang.String;
import java.util.Scanner;
public class EmailValidator {
    public static boolean isValidEmail(String email) {
        String emailRegex = "^([A-Za-z0-9]+)@(.+)\\.(.+)$";
        if(email.matches(emailRegex)) {
            System.out.println("valid");
            return true;
        }else {
            System.out.println("Invalid");
            return false;
        }
    }
public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String email=scanner.nextLine();
        System.out.println(isValidEmail(email));
}
}