package Classes.Com;

import java.io.*;
import java.util.*;

public class BrandList extends ArrayList<Brand> {

    ArrayList<Brand> brands;

    public BrandList() {
        brands = new ArrayList<>();
    }

    public boolean loadFromFile(String filename) {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() < 10) {
                    continue;
                }

                String[] data = line.split("[,:] ");
                Brand brnd = new Brand();

                brnd.setBrandID(data[0]);
                brnd.setBrandName(data[1]);
                brnd.setSoundBrand(data[2]);
                brnd.setPrice(Double.parseDouble(data[3]));

                this.add(brnd);
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
        } catch (Exception e) {
            System.err.println("ErrBrandLoad: " + e);
        }
        return false;
    }

    public boolean saveToFile(String filename) {
        if (this.isEmpty()) {
            System.out.println("Empty brandList");
            return false;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            for (Brand x : this) {
                bw.write(x.toString());
                bw.newLine();
            }

            System.out.println("Done!!!");
            return true;
        } catch (IOException e) {
            System.err.println("Error writing file: " + filename);
        } catch (Exception e) {
            System.err.println("ErrBrandWrite: " + e);
        }
        return false;
    }

    public int searchID(String ID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBrandID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }

    public Brand getUserChoice() {
        Menu mnu = new Menu();
        return mnu.ref_getChoice(this);
    }

    public void addBrand() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brandID: ");
        String tID = sc.nextLine().trim().toUpperCase();
        if (this.searchID(tID) != -1) {
            System.err.println("brandID already exist!!!");
            return;
        }

        String tName;
        do {
            System.out.print("Enter brandName: ");
            tName = sc.nextLine().trim();
        } while (tName.length() < 1);

        String tSound;
        do {
            System.out.print("Enter soundBrand: ");
            tSound = sc.nextLine().trim();
        } while (tSound.length() < 1);

        double tPrice;
        do {
            System.out.print("Enter price (>0): ");
            tPrice = Double.parseDouble(sc.nextLine());
        } while (tPrice <= 0);

        this.add(new Brand(tID, tName, tSound, tPrice));

    }

    public void updateBrand() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brandID: ");
        String tID = sc.nextLine().trim().toUpperCase();

        int pos = this.searchID(tID);
        if (pos == -1) {
            System.err.println("brandID not found!!!");
            return;
        }

        String tName;
        do {
            System.out.print("Enter brandName: ");
            tName = sc.nextLine().trim();
        } while (tName.length() < 1);

        String tSound;
        do {
            System.out.print("Enter soundBrand: ");
            tSound = sc.nextLine().trim();
        } while (tSound.length() < 1);

        double tPrice;
        do {
            System.out.print("Enter price (>0): ");
            tPrice = Double.parseDouble(sc.nextLine());
        } while (tPrice <= 0);

        this.get(pos).setBrandName(tName);
        this.get(pos).setSoundBrand(tSound);
        this.get(pos).setPrice(tPrice);

    }

    public void listBrands() {
        for (Brand brand : this) {
            System.out.println(brand);
        }
    }

}
