package az.edu.turing.MyApps.BankApplication;

public class DebitCard extends Card{
    public DebitCard(double balance, CardType type) {
        super(balance, type);
    }

    public DebitCard(CardType type) {
        super(type);
        this.setBalance(0);
    }
}
