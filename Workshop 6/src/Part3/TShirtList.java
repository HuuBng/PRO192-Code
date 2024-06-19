package Part3;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class TShirtList extends TShirt implements I_List {
    
    List<TShirt> list = new ArrayList<>();
    
    @Override
    public void addFromFile(String fName) {
        //    Your code is here!

        if (list.size() > 0) {
            list.clear();
        }
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fName));
            String line;
            
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("")) {
                    continue;
                }
                
                String[] data = line.split(";");
                TShirt ts = new TShirt();
                
                ts.setCode(data[0]);
                ts.setMake(data[1]);
                ts.setStyle(data[2]);
                ts.setSize(Integer.parseInt(data[3]));
                ts.setColor(Integer.parseInt(data[4]));
                
                list.add(ts);
                
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + fName);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void saveToFile(String fName) {
        //    Your code is here!

        if (list.isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fName));
            
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).toString().toUpperCase().replaceAll(", ", ","));
                bw.newLine();
            }
            
            bw.close();
            
        } catch (IOException e) {
            System.out.println("Error writing file: " + fName);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public int find(String code) {
        //    Your code is here!

        boolean found = false;
        
        TShirt tmp = new TShirt();
        
        for (TShirt ts : list) {
            if (ts.getCode().equalsIgnoreCase(code)) {
                found = true;
                tmp = ts;
                break;
            }
        }
        if (!found) {
            return -1;
        } else {
            return 1;
        }
    }
    
    @Override
    public void addTShirt() {
        //    Your code is here!

        TShirt ts = new TShirt();
        
        ts.input();
        list.add(ts);
    }
    
    @Override
    public void findTShirtByStyle(String style) {
        //    Your code is here!

        boolean found = false;
        
        for (TShirt ts : list) {
            if (ts.getStyle().equalsIgnoreCase(style)) {
                found = true;
                System.out.println(ts);
            }
        }
        
        if (!found) {
            System.out.println("Not found: " + style);
        }
    }
    
    @Override
    public void findTShirtByPartOfStyle(String style) {
        //    Your code is here!

        boolean found = false;
        
        for (TShirt ts : list) {
            if (ts.getStyle().toLowerCase().contains(style.toLowerCase())) {
                found = true;
                System.out.println(ts);
            }
        }
        
        if (!found) {
            System.out.println("Not found: " + style);
        }
    }
    
    @Override
    public void remove() {
        //    Your code is here!
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        String code = sc.nextLine().toUpperCase().trim();
        
        if (find(code) == -1) {
            System.out.println("Not found: " + code);
            return;
        }
        
        int pos = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(code)) {
                pos = i;
                
            }
        }
        
        list.remove(pos);
        System.out.println("Removed: " + code);
    }
    
    @Override
    public void update() {
        //    Your code is here!
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        String code = sc.nextLine().toUpperCase().trim();
        
        if (find(code) == -1) {
            System.out.println("Not found: " + code);
            return;
        }
        
        int pos = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(code)) {
                pos = i;
            }
        }
        
        System.out.print("Enter new size: ");
        String t1 = sc.nextLine().trim();
        if (t1.length() != 0) {
            list.get(pos).setSize(Integer.parseInt(t1));
        }
        
        System.out.print("Enter new color: ");
        String t2 = sc.nextLine().trim();
        if (t2.length() != 0) {
            list.get(pos).setColor(Integer.parseInt(t2));
        }
        
    }
    
    @Override
    public void sortAndPrint() {
        //    Your code is here!

        List<TShirt> tList = new ArrayList<>();
        tList = list;
        
        Comparator<TShirt> sortAsc = (t1, t2) -> t1.compareTo(t2);
        
        tList.sort(sortAsc);
        
        for (TShirt ts : tList) {
            System.out.println(ts.toString());
        }
        
    }
}
