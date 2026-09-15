class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining Balance = " + balance);
    }
}

class Main {
    public static void main(String[] args) {

        ATM atm = new ATM(5000);

        try {
            atm.withdraw(6000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}