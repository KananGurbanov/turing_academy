package az.edu.turing.MyApps.BankApplication;

public abstract class Card {

    public CardType type;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Card(double balance, CardType type) {
        this.balance = balance;
        this.type = type;
    }

    public Card(CardType type) {
        this.balance = 0;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Card{" +
                "balance=" + balance +
                '}';
    }
}
