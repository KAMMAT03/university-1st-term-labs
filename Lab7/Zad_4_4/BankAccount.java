package Zad_4_4;

public class BankAccount {
    private long accountnr;
    private String password;
    private float balance;

    public BankAccount(long accountnr, String password, float balance) {
        this.accountnr = accountnr;
        this.password = password;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public long getAccountnr() {
        return accountnr;
    }

    public void setAccountnr(long accountnr) {
        this.accountnr = accountnr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
