
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Ws2Part2_2 {
    public String inputString() throws Exception {
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
        return s;
    }
    
    public static void main(String[] args) {
        Ws2Part2_2 obj = new Ws2Part2_2();
        boolean cont = false;
        do {
            try{
                String s = obj.inputString();
                System.out.println("The string is " + s);
                cont = false;
            } catch(Exception e) {
                System.out.println("The string is invalid!");
                cont = true;
            }
        } while (cont);
    }
}
