package az.edu.turing.MyApps.BankingApplication;

public class CreditCard extends Card{

    public static int numCreditCards = 0;

    private int id;
    private double loan;
    public CreditCard(Company make) {
        super(make);
        this.id = ++numCreditCards;

    }

    public CreditCard(double balance, Company make, double loan) {
        super(balance, make);
        this.loan = loan;
        this.id = ++numCreditCards;
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
        return "CreditCard{" +
                "id=" + id +
                ", balance=" + getBalance() +
                ", loan=" + loan +
                ", make=" + make +
                '}';
    }
}
