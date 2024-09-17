package src;
import java.lang.String;
import java.util.Scanner;
public class EmailValidator {
    public static boolean isValidEmail(String email) {
        String emailRegex = "^([A-Za-z0-9]+)@(.+)\\.(.+)$";
        if(email.matches(emailRegex)) {

            return true;
        }else {

            return false;
        }
    }
public static void main(String[] args) {
       EmailValidator emailValidator=new EmailValidator();
       if (emailValidator.isValidEmail("akshu19721@gmail.com")){
           System.out.println("valid");
       }else {
           System.out.println("Invalid");
       }
}
}