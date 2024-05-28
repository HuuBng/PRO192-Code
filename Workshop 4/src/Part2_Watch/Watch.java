package Part2_Watch;

public class Watch {

    // Fields
    public String code;
    public double price;

    // Constructors
    public Watch() {
        code = null;
        price = 0;
    }

    public Watch(String code, double price) {
        this.code = code;
        this.price = price;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    // Seters
    public void setCode(String code) {
        this.code = code;
    }

    // Others
    public void outputWatch() {
        System.out.println(code + ", " + price);
    }
}
