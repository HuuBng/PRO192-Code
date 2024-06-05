package Part1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MyPolymorphism implements IPolymorphism {

    @Override
    public int f1(String str) {
        int count = 0;
        Matcher oddDigit = Pattern.compile("[13579]").matcher(str);
        while (oddDigit.find()) {
            count++;
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String s;
        String strReplace = "XYZ";
        Matcher wordMatcher = Pattern.compile("[a-zA-Z]\\d{2,}").matcher(str);
        s = str.replaceAll("[a-z]\\d{2,}", strReplace);
        return s;
    }
}
