import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authority {
    static String USER_REGEX = "/\\b(?<!\\#)[a-zA-Z]+(?!\\#)\\b/g";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(USER_REGEX);

        System.out.println("Ashfaq".matches(USER_REGEX));
    }
}
