package Zad_4_1;

public class Student {
    private String name;
    private String lastname;
    private int yearofbirth;
    private int monthofbirth;
    private int dayofbirth;
    private String placeofbirth;

    public Student(String name, String lastname, int yearofbirth, int monthofbirth, int dayofbirth, String placeofbirth) {
        this.name = name;
        this.lastname = lastname;
        this.yearofbirth = yearofbirth;
        this.monthofbirth = monthofbirth;
        this.dayofbirth = dayofbirth;
        this.placeofbirth = placeofbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public int getMonthofbirth() {
        return monthofbirth;
    }

    public void setMonthofbirth(int monthofbirth) {
        this.monthofbirth = monthofbirth;
    }

    public int getDayofbirth() {
        return dayofbirth;
    }

    public void setDayofbirth(int dayofbirth) {
        this.dayofbirth = dayofbirth;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public void setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
    }
}
