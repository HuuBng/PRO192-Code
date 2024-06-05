package Part5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MyPolymorphism implements IPolymorphism {

    @Override
    public int f1(String str) {
        int count = 0;
        Matcher letter = Pattern.compile("[a-z]").matcher(str);
        while (letter.find()) {
            count++;
        }
        return count;
    }

    @Override
    public int f2(String str) {
        Matcher number = Pattern.compile("\\d+").matcher(str);
        if (number.matches()) {
            int num = Integer.parseInt(str);
            return num * num;
        } else {
            return str.length();
        }
    }
}
