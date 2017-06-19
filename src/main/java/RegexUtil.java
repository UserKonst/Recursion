
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    final static String regex = "^((.*)\\W+\\w+@)?";
    final static String string = "+7 (101) 111-222-11  abc@ert.com, def@sdf.org";

    final static Pattern pattern = Pattern.compile(regex);
    final static Matcher matcher = pattern.matcher(string);

    public static void main(String args[]) throws Exception {
        
        matcher.find();
        System.out.println(matcher.group(21));

    }
}
