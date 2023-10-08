package Zad_4_3;

import java.util.Objects;

public class Table extends Furniture{
    private int legs;

    public Table(int legs, String type) {
        super(type);
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "stół " + getType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return legs == table.legs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs);
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

}
