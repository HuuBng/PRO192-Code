package Part5_SDrink;

public class SpecSDrink extends SDrink {

    // Fields
    public String unit;

    // Constructors
    public SpecSDrink() {
        make = null;
        price = 0;
        unit = null;
    }

    public SpecSDrink(String unit, String make, double price) {
        this.unit = unit;
        this.make = make;
        this.price = price;
    }

    // Getters
    public double getValue() {
        return unit.contains("24 cans") ? price + price * 0.05 : price;
    }

    // Setters
    public void setData() {
        String[] tmp = make.toLowerCase().trim().split("-");
        make = String.join(" ", tmp);
    }

    // Others
    @Override
    public String toString() {
        return super.toString() + "\n" + super.toString() + ", " + unit;
    }
}
