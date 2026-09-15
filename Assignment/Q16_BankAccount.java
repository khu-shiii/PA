import java.util.*;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}

class Main {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.accountNumber = 101;
        b.accountHolderName = "Khushi";
        b.balance = 5000;

        b.deposit(1000);
        b.withdraw(2000);
        b.checkBalance();
    }
}