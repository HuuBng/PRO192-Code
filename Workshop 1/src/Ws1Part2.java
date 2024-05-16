
import java.util.Scanner;

public class Ws1Part2 {

    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Input number 1: ");
        num1 = sc.nextFloat();
        System.out.println("Input number 2: ");
        num2 = sc.nextFloat();
        System.out.println("Input the operator (+-*/): ");
        sc = new Scanner(System.in);
        op = sc.nextLine();

        // Processing
        switch (op) {
            case "+": {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 + num2));
                break;
            }
            case "-": {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 - num2));
                break;
            }
            case "*": {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 * num2));
                break;
            }
            case "/": {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 / num2));
                break;
            }
        }

    }

}
