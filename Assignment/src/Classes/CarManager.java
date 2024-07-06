package Classes;

import Classes.Com.*;
import java.util.*;

public class CarManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileBrands = "src/brands.txt";
        String fileCars = "src/cars.txt";

        BrandList brandList = new BrandList();
        brandList.loadFromFile(fileBrands);
        CarList carList = new CarList(brandList);
        carList.loadFromFile(fileCars);

        ArrayList<String> opts = new ArrayList<>();

        opts.add("List all brands");
        opts.add("Add a new brand");
        opts.add("Search a brand based on its ID");
        opts.add("Update a brand");
        opts.add("Save brands to the file, named brands.txt");
        opts.add("List all cars in ascending order of brand names");
        opts.add("List cars based on a part of an input brand name");
        opts.add("Add a car");
        opts.add("Remove a car based on its ID");
        opts.add("Update a car based on its ID");
        opts.add("Save cars to file, named cars.txt");

        Menu menu = new Menu();
        int choice;

        do {
            System.out.println("____________________________");
            System.out.println("\n       CAR MANAGER");
            System.out.println();
            choice = menu.int_getChoice(opts);
            switch (choice) {
                case 1:
                    brandList.listBrands();
                    break;
                case 2:
                    brandList.addBrand();
                    break;
                case 3:
                    System.out.print("Enter brandID: ");
                    String tID = sc.nextLine().toUpperCase();
                    int pos = brandList.searchID(tID);
                    if (pos == -1) {
                        System.err.println("Not found!!!");
                    } else {
                        System.out.println(brandList.get(pos).toString());
                    }
                    break;
                case 4:
                    brandList.updateBrand();
                    break;
                case 5:
                    brandList.saveToFile(fileBrands);
                    break;
                case 6:
                    carList.listCars();
                    break;
                case 7:
                    carList.printBasedBrandName();
                    break;
                case 8:
                    carList.addCar();
                    break;
                case 9:
                    if (carList.removeCar()) {
                        System.out.println("Removed!!!");
                    }
                    break;
                case 10:
                    if (carList.updateCar()) {
                        System.out.println("Update successful!!!");
                    }
                    break;
                case 11:
                    carList.saveToFile(fileCars);
                    break;
                default:
                    System.out.println("Goodbye!!!");
            }
        } while (choice > 0 && choice <= opts.size());
    }
}
