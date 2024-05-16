
public class Ws1Part5_Fraction {

    private int numerator;
    private int denominator;

    public Ws1Part5_Fraction() {
        this(0, 1);
    }

    public Ws1Part5_Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplifyFraction();
    }

    // Getters and Setters
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplifyFraction();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
        simplifyFraction();
    }

    // Greatest Common Divisor (GCD) Calculation
    private int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    // Fraction Simplification
    public void simplifyFraction() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Arithmetic Operations (add, subtract, multiply, divide)
    public Ws1Part5_Fraction addFraction(Ws1Part5_Fraction other) {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Ws1Part5_Fraction(newNumerator, newDenominator);
    }

    public Ws1Part5_Fraction subFraction(Ws1Part5_Fraction other) {
        int newNumerator = numerator * other.denominator - other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Ws1Part5_Fraction(newNumerator, newDenominator);
    }

    public Ws1Part5_Fraction mulFraction(Ws1Part5_Fraction other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new Ws1Part5_Fraction(newNumerator, newDenominator);
    }

    public Ws1Part5_Fraction divFraction(Ws1Part5_Fraction other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new Ws1Part5_Fraction(newNumerator, newDenominator);
    }

    // Output
    public void output() {
        System.out.println(numerator + "/" + denominator);
    }
}
