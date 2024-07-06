package Classes.Com;

public class Car {

    // Fields
    private String carID;
    private Brand brand;
    private String color;
    private String frameID;
    private String engineID;

    // Constructors
    public Car() {
    }

    public Car(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }

    // Getters
    public String getCarID() {
        return carID;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getFrameID() {
        return frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    // Setters
    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    // Others
    @Override
    public String toString() {
        return this.getCarID() + ", " + brand.getBrandID() + ", " + this.getColor() + ", " + this.getFrameID() + ", " + this.getEngineID();
    }

    public int comparedTo(Car c) {
        int d = this.brand.getBrandName().compareTo(c.brand.getBrandName());
        if (d != 0) {
            return d;
        }
        return this.getCarID().compareTo(c.getCarID());
    }

    public String screenString() {
        return this.getBrand() + ", \n, " + this.getCarID() + ", " + this.getColor() + ", " + this.getFrameID() + ", " + this.getEngineID();
    }
}
