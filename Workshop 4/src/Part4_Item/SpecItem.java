package Part4_Item;

public class SpecItem extends Item {

    // Fields
    public int color;

    // Constructors
    public SpecItem() {
        code = null;
        price = 0;
        color = 0;
    }

    public SpecItem(int color, String code, int price) {
        this.code = code;
        this.color = color;
        this.price = price;
    }

    // Getters
    public int getValue() {
        return (color >= 5) ? price - 5 : price - 3;
    }

    // Setters
    public void setData() {
        String tmp = code.substring(2, code.length());
        code = code.substring(0, 2) + "-ABC-" + tmp;
    }

    // Others
    public void outputSpecItem() {
        outputItem();
        System.out.println(code + ", " + price + ", " + color);
    }
}
