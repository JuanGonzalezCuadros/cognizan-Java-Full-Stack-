package bankingApplication;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1001", "Roger Sanders", 700.0);
        BankAccount account2 = new BankAccount("1002", "Erika Aurelia", 530.0);

        account1.checkBalance();
        account2.checkBalance();

        //Invalid deposit
        try {
            account1.depositFunds(-30);
        } catch (BankAccount.InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        //Valid deposit
        try {
            account2.depositFunds(100);
        } catch (BankAccount.InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        //Invalid withdrawal
        try {
            account2.withdrawFunds(1000);
        } catch (BankAccount.InvalidAmountException | BankAccount.InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        //Valid withdrawal
        try {
            account1.withdrawFunds(200);
        } catch (BankAccount.InvalidAmountException | BankAccount.InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        account1.checkBalance();
        account2.checkBalance();
    }
}
