package Part4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPolymorphism implements IPolymorphism {

    @Override
    public void f1(String str) {
        String[] s = str.split(" ");
        for (String sx : s) {
            char[] c = sx.toCharArray();
            int icount = 0;
            for (char cx : c) {
                icount += (Character.isDigit(cx) && cx % 2 == 0) ? 1 : 0;
            }
            if (icount >= 1) {
                System.out.print(sx + " ");
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
