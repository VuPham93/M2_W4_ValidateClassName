import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_NAME_REGEX = "^[APC][0-9][0-9][0-9][0-9][GHIKLM]$";

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] classNames = {"C0318G", "C1323M", "M0318G", "P0323A"};

        System.out.println("Check result: ");
        for (String name: classNames) {
            System.out.println(validate(name));
        }
    }
}
