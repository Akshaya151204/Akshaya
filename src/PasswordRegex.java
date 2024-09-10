package src;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;
public class PasswordRegex {
    public static boolean isValidPassword(String password) {
        String passwordRegex = "((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@,#,&,*])).{12}";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        int[] count = new int[20];
        if (matcher.matches()) {
            for (int i = 0; i < count.length; i++)
                for (int j = 0; j < count.length; j++)
                    if (password.charAt(i) == password.charAt(j)) {
                        count[i]++;
                    }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                return true;
            }

        }return false;
    }



    public static void main(String[] args) {
        System.out.println(isValidPassword("AKSaHYA)!212"));
    }
}

