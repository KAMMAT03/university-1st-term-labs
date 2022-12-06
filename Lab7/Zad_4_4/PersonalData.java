package Zad_4_4;

public class PersonalData {
    private String name;
    private String lastname;
    private long pesel;
    private String city;

    public PersonalData(String name, String lastname, long pesel, String city) {
        this.name = name;
        this.lastname = lastname;
        this.pesel = pesel;
        this.city = city;
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

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
