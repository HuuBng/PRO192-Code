
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ws2Part4 {
    public static Scanner sc = new Scanner(System.in);
    
    public static String inputNonBlankStr(String msg) {
        System.out.print(msg);
        String str = sc.nextLine();
        while (str.length() == 0) {
            System.out.println("Please enter a non-blank string!");
            str = sc.nextLine();
        }
        return str;
    }

    public static int inputInt(String msg) {
        System.out.print(msg);
        int num = sc.nextInt();
        while(num <= 0) {
            System.out.println("Please enter a positive number!");
            num = sc.nextInt();
        }
        return num;
    }

    public static boolean inputBoolean(String msg) {
        System.out.print(msg);
        while (true) { 
            if (sc.hasNextBoolean()) {
                boolean bool = sc.nextBoolean();
                sc.nextLine(); 
                return bool;
            } else {
                System.out.println("Please enter TRUE or FALSE!");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        String VIN = inputNonBlankStr("Enter VIN: ");
        String model = inputNonBlankStr("Enter model: ");
        String brand = inputNonBlankStr("Enter brand: ");
        String colour = inputNonBlankStr("Enter colour: ");
        int enginePower = 0;
        boolean cont = false;
        do{
            try{
                enginePower = inputInt("Enter engine power: ");
                cont = false;
            }catch(Exception e){
                System.out.println("Please enter a number!");
                cont = true;
            }
        }while(cont);
        boolean convertible = inputBoolean("Enter convertible (TRUE/FALSE): ");
        boolean parkingBrake = inputBoolean("Enter parking brake (TRUE/FALSE): ");
        System.out.println("Vehicle Information: " + VIN + " " + model+ " " + brand + " " + colour + " " + enginePower + " " + convertible + " " + parkingBrake);

    }
}
