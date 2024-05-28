package Part1_Tshirt;

public class SpecTShirt extends TShirt {

    // Fields
    public int color;

    // Constructors
    public SpecTShirt() {
        style = null;
        size = 0;
        color = 0;
    }

    public SpecTShirt(int color, String style, int size) {
        this.color = color;
        this.style = style;
        this.size = size;
    }

    // Getters
    public int getValue() {
        return (color <= 5) ? size + 3 : size;
    }

    // Setters
    public void setData() {
        String tmp = style.substring(style.length() - 1, style.length());
        style = style.substring(0, style.length() - 1) + '-' + tmp;
    }

    // Others
    @Override
    public String toString() {
        return super.toString() + "\n" + super.toString() + ", " + color;
    }
}
