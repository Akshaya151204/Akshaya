package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

public class PhoneNumberRegex {

    public String extractPhoneNumbers(String text) {
        String phoneRegex = "\\(\\+\\d{2}\\)\\s\\d{5}-\\d{5} | \\d{3}-\\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            if (!result.isEmpty()) {
                result.append(" or ");
            }
            result.append(matcher.group());
        }
        if (!result.isEmpty()) {
            return result.toString();
        } else
            return "null";
    }


        public static void main(String[] args) {
            PhoneNumberRegex phoneNumberRegex=new PhoneNumberRegex();

            System.out.println(phoneNumberRegex.extractPhoneNumbers("Call me at (+91) 23456-72890 or at 987-424-4124"));
//            System.out.println(phoneNumberRegex.extractPhoneNumbers("No phone number here!"));
     }
    }


