package src;
import javax.imageio.stream.ImageInputStream;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateReplacement {
    public static String replaceDates(String text){
        String dateRegex="\\b(\\d{2})/(\\d{2})/(\\d{4})\\b";
        Pattern pattern=Pattern.compile(dateRegex);
        Matcher matcher=pattern.matcher(text);

        return matcher.replaceAll("$3-$2-$1");

    }

public static void main(String[] args) {
        String input1="The event is scheduled for 12/09/2024 and another one for 25/12/2024.";
        String newinput=replaceDates(input1);
        System.out.println(newinput);
}

}
