package Zad_4_4;

public class PersonalData {
    private String name;
    private String lastname;
    private long pesel;
    private long accountNr;
    private int pin;

    public PersonalData(String name, String lastname, long pesel, long accountNr, int pin) {
        this.name = name;
        this.lastname = lastname;
        this.pesel = pesel;
        this.accountNr = accountNr;
        this.pin = pin;
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

    public long getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(long accountNr) {
        this.accountNr = accountNr;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
