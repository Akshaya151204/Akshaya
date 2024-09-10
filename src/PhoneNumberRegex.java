package src;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

public class PhoneNumberRegex {


    public static String phoneNumber(String text) {

        String phoneRegex = "\\(\\+?\\(?\\d{2}\\)?[\\s-]?\\d{5}[\\s-]?\\d{5}|\\d{3}[\\s-]?\\d{3}[\\s-]?\\d{4}";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);
        String result="";
        while (matcher.find()) {
            result = result + matcher.group() + "or";
        }
        if (result != "") {
            return result;
        } else {
            return "null";
        }
    }

    public static void main(String[] args) {
        System.out.println(phoneNumber("Call me at (+91) 23456-72890 or at 987-424-4124"));
        System.out.println(phoneNumber("null"));
    }
}
