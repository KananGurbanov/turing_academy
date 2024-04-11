package az.edu.turing.MyApps.BankApplication;

public class BankAccount {
    private double balance;

    private double loan;

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

    public BankAccount() {
        this.balance = 0;
    }
}
