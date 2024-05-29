package Part3_Car;

public class Car {

    // Fields
    public String owner;
    public float price;

    // Constructors
    public Car() {
        owner = null;
        price = 0;
    }

    public Car(String owner, float price) {
        this.owner = owner;
        this.price = price;
    }

    // Getters
    public String getOwner() {
        return owner;
    }

    public float getPrice() {
        return price;
    }

    // Setters
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Others
    @Override
    public String toString() {
        return owner + ", " + price;
    }

}
