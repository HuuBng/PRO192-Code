
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Ws2Part2 {
    public static void main(String[] args) {
        boolean cont = false;
        do {
            try{
                // Input string
                String s = null;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string: ");
                s = sc.nextLine();
                
                // Pattern
                Pattern pattern = Pattern.compile("SE");
                Matcher matcher = pattern.matcher(s);
                
                if(!matcher.find())
                    throw new Exception();
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid!");
                cont = true;
            }
        } while (cont);
    }
}
