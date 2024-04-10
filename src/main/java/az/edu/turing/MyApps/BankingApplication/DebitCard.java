package az.edu.turing.MyApps.BankingApplication;

public class DebitCard {
    public static final int CAPACITY = 2000;

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addAmount(int amount){

        this.setAmount(this.getAmount() + amount);
    }


}
