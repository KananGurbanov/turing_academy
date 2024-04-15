package az.edu.turing.MyApps.BankingApplication;

public class DebitCard extends Card {

    public static int ID = 0;

    private int id;

    public DebitCard(Company make) {
        super(make);
        this.id = ++ID;
    }

    public DebitCard(double balance, Company make) {
        super(balance, make);
        this.id = ++ID;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "id=" + id +
                ", balance=" + getBalance() +
                ", make=" + make +
                '}';
    }
}
