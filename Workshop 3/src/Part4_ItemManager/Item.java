
package Part4_ItemManager;

public class Item {
    // Fields
    private String name;
    private int quantity;
    
    // Constructors
    public void Item() {
        name = null;
        quantity = 0;
    }
    
    public void Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    // Getters
    public String getName() {
        return name.toUpperCase();
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
