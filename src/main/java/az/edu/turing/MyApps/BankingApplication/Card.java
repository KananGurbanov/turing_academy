package az.edu.turing.MyApps.BankingApplication;

public abstract class Card {
    private double balance;

    public Company make;

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

    @Override
    public String toString() {
        return "Card{" +
                "balance=" + balance +
                ", make=" + make +
                '}';
    }
}
