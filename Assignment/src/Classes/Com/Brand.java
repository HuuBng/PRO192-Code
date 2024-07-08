package Classes.Com;

public class Brand {

    // Fields
    private String brandID;
    private String brandName;
    private String soundBrand;
    private double price;

    // Constructors
    public Brand() {
    }

    public Brand(String brandID, String brandName, String soundBrand, double price) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.soundBrand = soundBrand;
        this.setPrice(price);
    }

    // Getters
    public String getBrandID() {
        return brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getSoundBrand() {
        return soundBrand;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setSoundBrand(String soundBrand) {
        this.soundBrand = soundBrand;
    }

    public void setPrice(double price) {
        this.price = (price <= 0) ? 0.001 : price;
    }

    // Others
    @Override
    public String toString() {
        return this.getBrandID() + ", " + this.getBrandName() + ", " + this.getSoundBrand() + ": " + String.format("%.3f", this.getPrice());
    }

}
