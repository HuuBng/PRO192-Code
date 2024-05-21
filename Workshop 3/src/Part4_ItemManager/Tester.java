package Part4_ItemManager;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item i1 = new Item();

        System.out.print("Enter name: ");
        i1.setName(sc.nextLine());
        System.out.print("Enter quantity: ");
        i1.setQuantity(sc.nextInt());
        sc.nextLine();

        boolean cont = false;
        do {
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("1. Test getName()");
                System.out.println("2. Test setQuantity()");
                System.out.print("Enter TC (1 or 2): ");

                int choice = sc2.nextInt();
                if (choice < 1 || choice > 2) {
                    throw new Exception();
                }

                switch (choice) {
                    case 1: {
                        System.out.println("OUTPUT: ");
                        System.out.println(i1.getName());
                        break;
                    }
                    case 2: {
                        System.out.print("Enter new quantity: ");
                        i1.setQuantity(sc2.nextInt());
                        System.out.println("OUTPUT: ");
                        System.out.println(i1.getQuantity());
                        break;
                    }
                }
                cont = false;
            } catch (Exception e) {
                System.err.println("Invalid input");
                cont = true;
            }
        } while (cont);
    }
}
