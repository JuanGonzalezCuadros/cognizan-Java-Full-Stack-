package bankingApplication;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void checkBalance() {
        System.out.println("The balance for account " + accountNumber + " is: " + balance);
    }

    public void depositFunds(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("The amount to deposit must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposited amount: " + amount + ". The balance is now: " + balance);
    }

    public void withdrawFunds(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("The amount to withdraw must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("The withdraw amount is greater than the available balance.");
        }
        balance -= amount;
        System.out.println("Withdrew amount:  " + amount + ". The balance in now: " + balance);
    }

    class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    class InvalidAmountException extends Exception {
        public InvalidAmountException(String message) {
            super(message);
        }
    }
}
