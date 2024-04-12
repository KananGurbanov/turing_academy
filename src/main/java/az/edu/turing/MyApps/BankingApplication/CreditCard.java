package az.edu.turing.MyApps.BankingApplication;

public class CreditCard extends Card{
    private double loan;
    public CreditCard(Company make) {
        super(make);

    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }
}
