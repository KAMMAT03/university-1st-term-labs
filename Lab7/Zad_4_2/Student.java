package Zad_4_2;

public class Student extends Person{
    private float albumnr;
    private String wydzial;
    private String kierunek;

    public Student(String name, String lastname, int yearofbirth, int monthofbirth, int dayofbirth, String placeofbirth,
                   String mailadress, float albumnr, String wydzial, String kierunek) {
        super(name, lastname, yearofbirth, monthofbirth, dayofbirth, placeofbirth, mailadress);
        this.albumnr = albumnr;
        this.wydzial = wydzial;
        this.kierunek = kierunek;
    }

    public float getAlbumnr() {
        return albumnr;
    }

    public void setAlbumnr(float albumnr) {
        this.albumnr = albumnr;
    }

    public String getWydzial() {
        return wydzial;
    }

    public void setWydzial(String wydzial) {
        this.wydzial = wydzial;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }
}
