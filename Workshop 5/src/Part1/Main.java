package Part1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC (1 or 2): ");
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase().trim();
        MyPolymorphism myPoly = new MyPolymorphism();
        switch (choice) {
            case 1:
                System.out.println("OUTPUT: ");
                System.out.println(myPoly.f1(str));
                break;
            case 2:
                System.out.println("OUTPUT: ");
                System.out.println(myPoly.f2(str));
                break;
        }
    }
}
