import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string");
        String str = in.nextLine();
        Pattern pattern = Pattern.compile("(((\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3})(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)");
        //Pattern pat = Pattern.compile("(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("Error");
        }
    }
}