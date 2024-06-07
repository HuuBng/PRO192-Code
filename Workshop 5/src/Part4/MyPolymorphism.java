package Part4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPolymorphism implements IPolymorphism {

    @Override
    public void f1(String str) {
        String[] s = str.split("");
        Matcher evenDigit = Pattern.compile("\\b\\w*[2468]+\\w*\\b").matcher(str);
        while (evenDigit.find()) {
            for (int i = evenDigit.start(); i < evenDigit.end(); i++) {
                System.out.print(s[i] + " ");
            }
        }
    }

    @Override
    public int f2(String str) {
        int sum = 0;
        String[] s = str.split("");
        Matcher oddDigit = Pattern.compile("[13579]").matcher(str);
        while (oddDigit.find()) {
            sum += Integer.parseInt(s[oddDigit.start()]);
        }
        return sum;
    }
}
