
import java.util.Scanner;

public class Ws1Part3 {

    public static void main(String[] args) {
        String[] list = new String[10];

        // Input
        System.out.println("Enter list of name: ");
        for (int i = 0; i < list.length; i++) {
            Scanner sc = new Scanner(System.in);
            list[i] = sc.nextLine();

            // Lowercase string
            list[i] = list[i].toLowerCase();

            // Uppercase first character
            char c[] = list[i].toCharArray();
            c[0] -= 32;
            list[i] = new String(c);
        }

        // Output
        System.out.println("\nOutput: ");
        for (String x : list) {
            System.out.println(x);
        }

    }
}
