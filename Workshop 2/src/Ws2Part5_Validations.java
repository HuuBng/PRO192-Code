
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ws2Part5_Validations {

    public static Scanner sc = new Scanner(System.in);

    public static String inputNonBlankStr(String msg) {
        System.out.print(msg);
        String str = sc.nextLine().toUpperCase();
        while (str.length() == 0) {
            System.err.println("Please enter a non-blank string!");
            str = sc.nextLine().toUpperCase();
        }
        return str;
    }

    public static String inputPattern(String msg, Pattern pattern) {
        System.out.print(msg);
        String str = sc.nextLine();

        while (!pattern.matcher(str).find()) {
            System.err.println("Invalid input!");
            System.out.print(msg);
            str = sc.nextLine();
        }

        return str;
    }

    public static String inputGender(String msg, Pattern pattern) {
        System.out.print(msg);
        String str = sc.nextLine();

        while (!pattern.matcher(str).find()) {
            System.err.println("Invalid input!");
            System.out.print(msg);
            str = sc.nextLine();
        }

        if (str.equalsIgnoreCase("0")) {
            return "female";
        } else {
            return "male";
        }
    }

}
