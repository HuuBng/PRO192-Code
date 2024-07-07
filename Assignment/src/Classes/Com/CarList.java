package Classes.Com;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class CarList extends ArrayList<Car> {

    BrandList brandList;

    public CarList(BrandList bList) {
        brandList = bList;
    }

    public boolean loadFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() < 1) {
                    continue;
                }

                String[] data = line.split(", ");
                Brand b = brandList.get(brandList.searchID(data[1]));
                this.add(new Car(data[0], b, data[2], data[3], data[4]));
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
        } catch (Exception e) {
            System.err.println("ErrCarLoad: " + e);
        }
        return false;
    }

    public boolean saveToFile(String filename) {
        if (this.isEmpty()) {
            System.out.println("Empty carList");
            return false;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            for (Car x : this) {
                bw.write(x.toString());
                bw.newLine();
            }

            System.out.println("Done!!!");
            return true;
        } catch (IOException e) {
            System.err.println("Error writing file: " + filename);
        } catch (Exception e) {
            System.err.println("ErrCarWrite: " + e);
        }
        return false;
    }

    public int searchID(String carID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCarID().equalsIgnoreCase(carID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchFrame(String fID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getFrameID().equalsIgnoreCase(fID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchEngine(String eID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getEngineID().equalsIgnoreCase(eID)) {
                return i;
            }
        }
        return -1;
    }

    public void addCar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter carID: ");
        String tID = sc.nextLine().trim().toUpperCase();
        if (this.searchID(tID) != -1) {
            System.err.println("ID already exist!!!");
            return;
        }

        Menu mnu = new Menu();
        Brand b = mnu.ref_getChoice(brandList);

        String tColor;
        do {
            System.out.print("Enter color: ");
            tColor = sc.nextLine().trim();
        } while (tColor.length() < 1);

        String tFrame;
        Pattern framePat = Pattern.compile("F\\d{4,}");
        do {
            System.out.print("Enter frameID: ");
            tFrame = sc.nextLine().trim().toUpperCase();

            if (!framePat.matcher(tFrame).matches()) {
                System.err.println("Does not match frameID format!!!");
            }

            if (this.searchFrame(tFrame) != -1) {
                System.err.println("frameID already exist!!!");
            }

        } while (!framePat.matcher(tFrame).matches() || this.searchFrame(tFrame) != -1);

        String tEngine;
        Pattern enginePat = Pattern.compile("E\\d{4,}");
        do {
            System.out.print("Enter engineID: ");
            tEngine = sc.nextLine().trim().toUpperCase();

            if (!enginePat.matcher(tEngine).matches()) {
                System.err.println("Does not match engineID format!!!");
            }

            if (this.searchFrame(tEngine) != -1) {
                System.err.println("engineID already exist!!!");
            }

        } while (!enginePat.matcher(tEngine).matches() || this.searchFrame(tEngine) != -1);

        this.add(new Car(tID, b, tColor, tFrame, tEngine));
    }

    public void printBasedBrandName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter part of brand name: ");
        String partOfBrandName = sc.nextLine().trim();

        int count = 0;
        for (Car c : this) {
            if (c.getBrand().getBrandName().contains(partOfBrandName)) {
                System.out.println(c.screenString());
                count++;
            }
        }

        if (count == 0) {
            System.err.println("No car is detected!");
        }
    }

    public boolean removeCar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter carID: ");
        String tID = sc.nextLine().trim().toUpperCase();

        int pos = this.searchID(tID);

        if (pos < 0) {
            System.err.println("ID not found!!!");
            return false;
        } else {
            this.remove(pos);
        }

        return true;
    }

    public boolean updateCar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter carID: ");
        String tID = sc.nextLine().trim().toUpperCase();

        int pos = this.searchID(tID);

        if (pos < 0) {
            System.err.println("ID not found!!!");
            return false;
        }

        Menu mnu = new Menu();
        Brand b = mnu.ref_getChoice(brandList);

        String tColor;
        do {
            System.out.print("Enter color: ");
            tColor = sc.nextLine().trim();
        } while (tColor.length() < 1);

        String tFrame;
        Pattern framePat = Pattern.compile("F\\w{4,}");
        do {
            System.out.print("Enter frameID: ");
            tFrame = sc.nextLine().trim().toUpperCase();

            if (!framePat.matcher(tFrame).matches()) {
                System.err.println("Does not match frameID format!!!");
            }

            if (this.searchFrame(tFrame) != -1) {
                System.err.println("frameID already exist!!!");
            }

        } while (!framePat.matcher(tFrame).matches() || this.searchFrame(tFrame) != -1);

        String tEngine;
        Pattern enginePat = Pattern.compile("E\\w{4,}");
        do {
            System.out.print("Enter engineID: ");
            tEngine = sc.nextLine().trim().toUpperCase();

            if (!enginePat.matcher(tEngine).matches()) {
                System.err.println("Does not match engineID format!!!");
            }

            if (this.searchFrame(tEngine) != -1) {
                System.err.println("engineID already exist!!!");
            }

        } while (!enginePat.matcher(tEngine).matches() || this.searchFrame(tEngine) != -1);

        this.get(pos).setBrand(b);
        this.get(pos).setColor(tColor);
        this.get(pos).setFrameID(tFrame);
        this.get(pos).setEngineID(tEngine);

        return true;
    }

    public void listCars() {
        Comparator<Car> sortBrandNameAsc = (c1, c2) -> c1.comparedTo(c2);

        this.sort(sortBrandNameAsc);
        for (Car c : this) {
            System.out.println(c.screenString());
        }
    }
}
