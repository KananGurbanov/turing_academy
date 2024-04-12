package az.edu.turing.MyApps.BankingApplication;

public class BankAccount {

    private double balance;

    private double loan;

    public BankAccount() {
        this.balance = 0;
        this.loan = 0;
    }

    public BankAccount(double balance, double loan) {
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

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", loan=" + loan +
                '}';
    }
}
