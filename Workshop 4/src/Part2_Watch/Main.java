package Part2_Watch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        String nCode = sc.nextLine().toUpperCase().trim();
        System.out.print("Enter price: ");
        double nPrice = Double.parseDouble(sc.nextLine());
        System.out.print("Enter size: ");
        int nSize = Integer.parseInt(sc.nextLine());
        Watch wt = new SpecWatch(nSize, nCode, nPrice);
        System.out.println("1. Test outputSpecWatch()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC (1,2,3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("OUTPUT: ");
                ((SpecWatch) wt).outputSpecWatch();
                break;
            case 2:
                System.out.println("OUTPUT: ");
                ((SpecWatch) wt).setData();
                wt.outputWatch();
                break;
            case 3:
                System.out.println("OUTPUT: ");
                double price = ((SpecWatch) wt).getValue();
                System.out.println(price);
                break;
        }
    }
}
