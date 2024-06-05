package Part3;

public class MyPolymorphism implements IPolymorphism {

    @Override
    public int f1(String str) {
        int count = 0;
        String[] s = str.split(" ");
        for (String x : s) {
            char[] c = x.toCharArray();
            int icount = 0;
            for (char cx : c) {
                icount += (Character.isDigit(cx)) ? 1 : 0;
            }
            count += (icount >= 2) ? 1 : 0;
        }
        return count;
    }

    @Override
    public void f2(String str) {
        String s;
        String sPattern = "[a-z0-9]*[2468]+[a-z0-9]*";
        String sReplace = "ABC";
        s = str.replaceAll(sPattern, sReplace);
        System.out.println(s);
    }
}
