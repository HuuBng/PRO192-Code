package Part4_Item;

public class Item {

    // Fields
    public String code;
    public int price;

    // Constructors
    public Item() {
        code = null;
        price = 0;
    }

    public Item(String code, int price) {
        this.code = code;
        this.price = price;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    // Seters
    public void setCode(String code) {
        this.code = code;
    }

    // Others
    public void outputItem() {
        System.out.println(code + ", " + price);
    }
}
