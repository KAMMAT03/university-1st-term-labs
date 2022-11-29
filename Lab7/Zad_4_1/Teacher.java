package Zad_4_1;

public class Teacher {
    private String name;
    private String lastname;
    private int yearofbirth;
    private int monthofbirth;
    private int dayofbirth;
    private String placeofbirth;
    private String mailadress;
    private float employeenr;

    public Teacher(String name, String lastname, int yearofbirth, int monthofbirth, int dayofbirth, String placeofbirth,
                   String mailadress, float employeenr) {
        this.name = name;
        this.lastname = lastname;
        this.yearofbirth = yearofbirth;
        this.monthofbirth = monthofbirth;
        this.dayofbirth = dayofbirth;
        this.placeofbirth = placeofbirth;
        this.mailadress = mailadress;
        this.employeenr = employeenr;
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

    public String getMailadress() {
        return mailadress;
    }

    public void setMailadress(String mailadress) {
        this.mailadress = mailadress;
    }

    public float getEmployeenr() {
        return employeenr;
    }

    public void setEmployeenr(float employeenr) {
        this.employeenr = employeenr;
    }
}
