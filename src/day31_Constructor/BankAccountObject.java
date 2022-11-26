package day31_Constructor;

import java.util.ArrayList;

public class BankAccountObject {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        BankAccount bankAccount4 = new BankAccount();

        bankAccount1.setInfo("Ekrem Mese", 34533, 200000);
        bankAccount2.setInfo("John Taylor", 3242343, 320000);
        bankAccount3.setInfo("Victor Hugo", 456127, 100000);
        bankAccount4.setInfo("Murteza Pashai", 4455443, 800000);

        bankAccount1.checkBalance();

        bankAccount1.deposit(20000);

        bankAccount1.withdraw(100000);

        BankAccount bankAccount5 = new BankAccount();


    }


}
