package Part5;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BookList extends Book implements I_List {
    List<Book> list = new ArrayList<>();
    
    @Override
    public void addFromFile(String fName) {
        //    Your code is here!
    }
    
    @Override
    public void saveToFile(String fName) {
        //    Your code is here!
    } 

    @Override
    public int find(String code) {
        //    Your code is here!
        return -1;
    }

    @Override
    public void addBook() {
        //    super.input();
        //    Your code is here!
    }
    
    @Override
    public void findBookByMake(String make) {       
        //    Your code is here!
    }
    
    @Override
    public void findBookByPartOfName(String name) {       
        //    Your code is here!
    }

    @Override
    public void remove() {
        //    Your code is here!
    }

    @Override
    public void update() {
        //    Your code is here!
    }

    @Override
    public void sortAndPrint(){
        //    Your code is here!
    }
}
