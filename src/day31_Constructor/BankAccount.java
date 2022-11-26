package day31_Constructor;

public class BankAccount {
    /*

     */

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public String toString() {
        return "BankAccount{" + "accountHolder='" + accountHolder + '\'' + ", accountNumber=" + accountNumber + ", balance= $" + balance + '}';
    }

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Account balance is: " + balance);
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        System.out.println("New balance is: " + (balance + amount));
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount can not be zero or negative");
            return;
        }
        System.out.println("Remaining balance is: " + (balance - amount));

    }
}


//1:55:50