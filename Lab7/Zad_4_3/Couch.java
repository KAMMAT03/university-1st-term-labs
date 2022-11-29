package Zad_4_3;

public class Couch extends Furniture{
    private int legs;
    public Couch(int legs, String type) {
        super(type);
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "kanapa " +
                 getType();
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
