package Zad_4_4;

public class BankCustomer {
    private PersonalData personalData;
    private BankAccount bankAccount;

    public BankCustomer(PersonalData personalData, BankAccount bankAccount) {
        this.personalData = personalData;
        this.bankAccount = bankAccount;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
