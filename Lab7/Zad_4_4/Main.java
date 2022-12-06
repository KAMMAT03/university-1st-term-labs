package Zad_4_4;

public class Main {
    public static void main(String[] args) {
        PersonalData personalData1 = new PersonalData("Kamil", "Matuszewski", 282828282, "Lublin");
        BankAccount konto1 = new BankAccount(377483, "asdfg", 204353);
        BankCustomer Customer1 = new BankCustomer(personalData1, konto1);
    }
}
