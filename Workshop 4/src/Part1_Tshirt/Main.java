package Part1_Tshirt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter style: ");
        String nStyle = sc.nextLine().toLowerCase().trim();
        System.out.print("Enter size: ");
        int nSize = Integer.parseInt(sc.nextLine());
        System.out.print("Enter color: ");
        int nColor = Integer.parseInt(sc.nextLine());
        TShirt st = new SpecTShirt(nColor, nStyle, nSize);
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
                ((SpecTShirt) st).setData();
                System.out.println(st.getStyle() + ", " + st.getSize());
                break;
            case 3:
                System.out.println("OUTPUT: ");
                int size = ((SpecTShirt) st).getValue();
                System.out.println(size);
                break;
        }
    }
}
