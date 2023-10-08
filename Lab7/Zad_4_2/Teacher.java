package Zad_4_2;

public class Teacher extends Person{
    private String employeenr;
    private String tytulnaukowy;

    public Teacher(String name, String lastname, int yearofbirth, int monthofbirth, int dayofbirth, String placeofbirth, String mailadress, String employeenr, String tytulnaukowy) {
        super(name, lastname, yearofbirth, monthofbirth, dayofbirth, placeofbirth, mailadress);
        this.employeenr = employeenr;
        this.tytulnaukowy = tytulnaukowy;
    }

    public String getEmployeenr() {
        return employeenr;
    }

    public void setEmployeenr(String employeenr) {
        this.employeenr = employeenr;
    }

    public String getTytulnaukowy() {
        return tytulnaukowy;
    }

    public void setTytulnaukowy(String tytulnaukowy) {
        this.tytulnaukowy = tytulnaukowy;
    }
}
