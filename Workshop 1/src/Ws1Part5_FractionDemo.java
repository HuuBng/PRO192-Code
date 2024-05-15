
import java.util.Scanner;

public class Ws1Part5_FractionDemo {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        
        // Input numerator and denominator of fractions
        System.out.print("Enter numerator of the first fraction: ");
        a = sc.nextInt();
        System.out.print("Enter denominator of the first fraction: ");
        b = sc.nextInt();
        System.out.print("Enter numerator of the second fraction: ");
        c = sc.nextInt();
        System.out.print("Enter denominator of the second fraction: ");
        d = sc.nextInt();

        // Initialize the fractions
        Ws1Part5_Fraction fr1 = new Ws1Part5_Fraction(a, b);
        Ws1Part5_Fraction fr2 = new Ws1Part5_Fraction(c, d);

        // Print out results
        System.out.print("Sum of them: ");
        fr1.addFraction(fr2).output();

        System.out.print("Subtract of them: ");
        fr1.subFraction(fr2).output();

        System.out.print("Mul. of them: ");
        fr1.mulFraction(fr2).output();

        System.out.print("Div. of them: ");
        fr1.divFraction(fr2).output();
    }
}
