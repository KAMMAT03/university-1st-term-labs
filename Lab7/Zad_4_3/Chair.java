package Zad_4_3;

public class Chair extends Furniture{

    public Chair(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "krzasło " + getType();
    }
}
