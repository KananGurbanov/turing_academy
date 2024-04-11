package az.edu.turing.MyApps.BankApplication;

public class CreditCard extends Card{
    private double loan;

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public CreditCard(double balance, CardType type) {
        super(balance,type);
        this.loan = 0;
    }

    public CreditCard(CardType type) {
        super(type);

        this.setBalance(0);

        this.loan  = 0;


    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "balance=" + getBalance() +
                "loan=" + loan +
                '}';
    }
}
