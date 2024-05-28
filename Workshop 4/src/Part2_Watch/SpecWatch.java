package Part2_Watch;

public class SpecWatch extends Watch {

    // Fields
    public int size;

    // Constructors
    public SpecWatch() {
        code = null;
        price = 0;
        size = 0;
    }

    public SpecWatch(int size, String code, double price) {
        this.code = code;
        this.size = size;
        this.price = price;
    }

    // Getters
    public double getValue() {
        return (size <= 39) ? price - price * 0.1 : price + price * 0.05;
    }

    // Setters
    public void setData() {
        String tmp = code.substring(2, code.length());
        code = "XYZ" + tmp;
    }

    // Others
    public void outputSpecWatch() {
        outputWatch();
        System.out.println(code + ", " + price + ", " + size);
    }
}
