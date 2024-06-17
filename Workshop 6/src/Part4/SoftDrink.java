package Part4;


public class SoftDrink extends Item implements Comparable<SoftDrink> {    
    private int volume;
    private double price;
    
    public SoftDrink() {
         super();
    }
    
    public SoftDrink(String code, String make, int volume, double price) {
        super(code, make);
        this.volume = volume;
        this.price = price;
    }
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public int compareTo(SoftDrink obj) {       
        return 0;
    }  
}
