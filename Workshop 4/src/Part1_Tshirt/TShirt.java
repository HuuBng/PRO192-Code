package Part1_Tshirt;

public class TShirt {

    // Fields
    public String style;
    public int size;

    // Constructors
    public TShirt() {
        style = null;
        size = 0;
    }

    public TShirt(String style, int size) {
        this.style = style;
        this.size = size;
    }

    // Getters
    public String getStyle() {
        return style;
    }

    public int getSize() {
        return size;
    }

    // Setters
    public void setStyle(String style) {
        this.style = style;
    }

    // Others
    @Override
    public String toString() {
        return style + ", " + size;
    }
}
