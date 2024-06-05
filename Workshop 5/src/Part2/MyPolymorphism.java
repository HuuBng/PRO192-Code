package Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPolymorphism implements IPolymorphism {

    @Override
    public int f1(String str) {
        String[] s = str.split(" ");
        int max = 0;
        for (String x : s) {
            max = (max < x.length()) ? x.length() : max;
        }
        return max;
    }

    @Override
    public double f2(String str) {
        int count = 0;
        double sum = 0;
        String[] s = str.split("");
        Matcher evenDigit = Pattern.compile("[2468]").matcher(str);
        while (evenDigit.find()) {
            sum += Double.parseDouble(s[evenDigit.start()]);
            count++;
        }
        return sum / count;
    }
}
