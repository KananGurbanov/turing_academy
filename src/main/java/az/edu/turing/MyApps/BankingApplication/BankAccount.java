package az.edu.turing.MyApps.BankingApplication;

public class BankAccount {

    public static int numBankAccounts = 0;

    private int id;

    private double balance;

    private double loan;

    public BankAccount() {
        this.id = ++numBankAccounts;
        this.balance = 0;
        this.loan = 0;
    }

    public BankAccount(double balance, double loan) {
        this.id = ++numBankAccounts;
        this.balance = balance;
        this.loan = loan;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", loan=" + loan +
                '}';
    }
}
