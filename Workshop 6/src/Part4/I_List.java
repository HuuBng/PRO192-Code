package Part4;

// =========================================================
// Do NOT modify this file 
// =========================================================
import java.util.List;
//Interface for a group of objects
public interface I_List {
    void addFromFile(String fName);
    void saveToFile(List<SoftDrink> list, String fName);
    void findSoftDrinkByCode(String code);
    void findSoftDrinkByMake(String make);
    void findSoftDrinkByVolume(int volume);
    SoftDrink findSoftDrinkWithMaxPrice();
    SoftDrink findSoftDrinkWithMinPrice();
    void countSoftDrink();
    void sortAndPrint();
}
// =========================================================
// Do NOT modify this file 
// =========================================================