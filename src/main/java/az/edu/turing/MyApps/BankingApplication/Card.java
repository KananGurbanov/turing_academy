package az.edu.turing.MyApps.BankingApplication;

public abstract class Card {
    private double balance;

    public Company make;

    public Card(double balance, Company make) {
        this.balance = balance;
        this.make = make;
    }

    public Card(Company make) {
        this.make = make;
        this.balance = 0;
    }

    public Card() {
        this.make = Company.UNKNOWN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
