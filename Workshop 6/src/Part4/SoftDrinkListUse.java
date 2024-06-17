package Part4;

// =========================================================
// Do NOT modify this file 
// =========================================================
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftDrinkListUse {
    public static List<SoftDrink> createSoftDrinkList() {
        List<SoftDrink> list = new ArrayList<>();
        list.add(new SoftDrink("PS021", "Pepsi", 320, 199.0));
        list.add(new SoftDrink("MD033", "Mirinda", 330, 125.0));
        list.add(new SoftDrink("SP005", "Schweppes", 320, 156.0));
        list.add(new SoftDrink("2C017", "Coca-Cola", 235, 182.0));
        list.add(new SoftDrink("MD020", "Mirinda", 330, 165.0));
        return list;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String filename = "data-2.dat";
        I_Menu menu = new Menu();
        menu.addItem("Create SoftDrink");
        menu.addItem("Seach SoftDrink");
        menu.addItem("Show SoftDrink");
        menu.addItem("Others: Quit"); 
        int choice;
        String choice2 = null;
        String choice3 = null;
        boolean quit = false;
        I_List list = new SoftDrinkList();
        list.addFromFile(filename); // load initial data
        do{
            System.out.println("____________________________");
            System.out.println("\n     SOFTDRINK MANAGER");
            System.out.println();
            choice= menu.getChoice();
            switch(choice){
                case 1: 
                    List<SoftDrink> softDrinkList = createSoftDrinkList();
                    list.saveToFile(softDrinkList,filename);
                    System.out.println("List created:");
                    list.sortAndPrint();
                    break;
                case 2: 
                    ArrayList<String> list2 = new ArrayList<>();
                    do{                        
                        list2.clear();
                        list2.add("Seach by code");
                        list2.add("Seach by make");
                        list2.add("Seach by volume");
                        choice2 = menu.getChoice2(list2);
                        switch(choice2) {
                            case "2.1": 
                                System.out.print("   Enter code: ");
                                String code = sc.nextLine();  
                                list.findSoftDrinkByCode(code);
                                break;    
                            case "2.2": 
                                System.out.print("   Enter make: ");
                                String make = sc.nextLine();  
                                list.findSoftDrinkByMake(make);
                                break;
                            case "2.3": 
                                System.out.print("   Enter volume: ");
                                int volume = Integer.parseInt(sc.nextLine());  
                                list.findSoftDrinkByVolume(volume);
                                break;
                            default:
                                quit = true;
                        }   
                    } while (!quit); 
                    break;
                case 3: 
                    ArrayList<String> list3 = new ArrayList<>();
                    do{                        
                        list3.clear();
                        list3.add("Show by highest price");
                        list3.add("Show by lowest price");
                        choice3 = menu.getChoice3(list3);
                        switch(choice3) {
                            case "3.1": 
                                System.out.println("   " 
                                        + list.findSoftDrinkWithMaxPrice());
                                break;    
                            case "3.2": 
                                System.out.println("   " 
                                        + list.findSoftDrinkWithMinPrice());
                                break;
                            default:
                                quit = true;
                        }   
                    } while (!quit); 
                    break;          
           }
       }
       while (choice>0 && choice<=3);
   }   
}
// =========================================================
// Do NOT modify this file 
// =========================================================