package lab_6;

public class BankAccouunt {

    private int accountId;
    private String accountHolder;
    private double amount;

    public BankAccouunt(int accountId, String accountHolder) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        amount = 0.0;
    }

    public BankAccouunt(int accountId, String accountHolder, double amount) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.amount = amount;
    }

    public void deposit(double amount) {
        this.amount = this.amount + amount;
        System.out.println("============================");
        System.out.println("Deposit  Amount     : " + amount);
        System.out.println("Total    Amount     : " + this.amount);
        System.out.println("============================");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.amount) {
            this.amount = this.amount - amount;
            System.out.println("============================");
            System.out.println("Withdraw  Amount     : " + amount);
            System.out.println("Total     Amount     : " + this.amount);
            System.out.println("============================");
        } else {
            System.out.println("============================");
            System.out.println("Sorry , You Don't Have Any Cash ..!");
            System.out.println("============================");
        }
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAmount() {
        return amount;
    }

}
