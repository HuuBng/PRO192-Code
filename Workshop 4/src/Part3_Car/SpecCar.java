package Part3_Car;

public class SpecCar extends Car {

    // Fields
    public String color;

    // Constructors
    public SpecCar() {
        owner = null;
        price = 0;
        color = null;
    }

    public SpecCar(String color, String owner, float price) {
        this.color = color;
        this.owner = owner;
        this.price = price;
    }

    // Getters
    public float getValue() {
        return color.equalsIgnoreCase("Silver") ? price - price * 0.1f : price;
    }

    // Setters
    public void setData() {
        String[] tmp = owner.toLowerCase().trim().split(" ");
        
        for (int i = 0; i < tmp.length; i++) {
            char[] c = tmp[i].toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            tmp[i] = new String(c);
        }
        
        owner = String.join(" ", tmp);
    }

    // Others
    @Override
    public String toString() {
        return super.toString() + "\n" + super.toString() + ", " + color;
    }
}
