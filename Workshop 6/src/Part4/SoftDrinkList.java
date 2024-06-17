package Part4;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class SoftDrinkList extends SoftDrink implements I_List {
    List<SoftDrink> list = new ArrayList<>();
   
    @Override
    public void addFromFile(String fName) {
        //    Your code is here!
    }
    
    @Override
    public void saveToFile(List<SoftDrink> list, String fName) {
        //    Your code is here!
    } 
    
    @Override
    public void findSoftDrinkByCode(String code) {
        //    Your code is here!
    }
    
    @Override
    public void findSoftDrinkByMake(String make) {  
        //    Your code is here!
    }
    
    @Override
    public void findSoftDrinkByVolume(int volume) {
        //    Your code is here!
    }
    
    @Override
    public SoftDrink findSoftDrinkWithMaxPrice() {
        //    Your code is here!
        return null;
    }
    
    @Override
    public SoftDrink findSoftDrinkWithMinPrice() {
        //    Your code is here!
        return null;
    }
    
    @Override
    public void countSoftDrink(){
        //    Your code is here!
    }
    
    @Override
    public void sortAndPrint() {
        //    Your code is here!
    }
}
