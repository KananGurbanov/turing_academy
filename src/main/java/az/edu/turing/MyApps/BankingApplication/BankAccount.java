package az.edu.turing.MyApps.BankingApplication;

public class BankAccount {
    private int balance;

    public int loan;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this.balance = 0;
    }


    public int getBalance() {
        return balance;
    }


    public void addBalance(int amount){
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", loan=" + loan +
                '}';
    }
}
