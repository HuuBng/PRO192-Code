package Part5_SDrink;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter make: ");
        String nMake = sc.nextLine().toLowerCase().trim();
        System.out.print("Enter price: ");
        double nPrice = Double.parseDouble(sc.nextLine());
        System.out.print("Enter unit: ");
        String nUnit = sc.nextLine().toLowerCase().trim();
        SDrink st = new SpecSDrink(nUnit, nMake, nPrice);
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC (1,2,3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("OUTPUT: ");
                System.out.println(st.toString());
                break;
            case 2:
                System.out.println("OUTPUT: ");
                ((SpecSDrink) st).setData();
                System.out.println(st.getMake() + ", " + st.getPrice());
                break;
            case 3:
                System.out.println("OUTPUT: ");
                double price = ((SpecSDrink) st).getValue();
                System.out.println(price);
                break;
        }
    }
}
