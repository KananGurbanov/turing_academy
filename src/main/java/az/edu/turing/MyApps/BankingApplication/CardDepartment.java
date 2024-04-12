package az.edu.turing.MyApps.BankingApplication;

public class CardDepartment {

    public void giveDebitCard(Human h, Company make){

        DebitCard c = new DebitCard(make);
        h.getWallet().getCards().add(c);
        h.getWallet().haveDebitCard = true;
    }

    public void giveCreditCard(Human h, Company make){
        CreditCard c = new CreditCard(make);

        h.getWallet().getCards().add(c);

        h.getWallet().haveCreditCard = true;
    }
}
