package Part5_SDrink;

public class SDrink {

    // Fields
    public String make;
    public double price;

    // Constructors
    public SDrink() {
        make = null;
        price = 0;
    }

    public SDrink(String make, double price) {
        this.make = make;
        this.price = price;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    // Others
    @Override
    public String toString() {
        return make + ", " + price;
    }

}
