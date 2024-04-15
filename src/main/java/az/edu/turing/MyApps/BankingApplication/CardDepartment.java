package az.edu.turing.MyApps.BankingApplication;

public interface CardDepartment {

    default void giveDebitCard(Human h, Company make){

        DebitCard c = new DebitCard(make);
        h.getWallet().getCards().add(c);
        h.getWallet().haveDebitCard = true;
    }

    default  void giveCreditCard(Human h, Company make){
        CreditCard c = new CreditCard(make);

        h.getWallet().getCards().add(c);

        h.getWallet().haveCreditCard = true;
    }

    default void deleteCard(Human h, Card c){
        h.getWallet().getCards().remove(c);

        System.out.println("Card " + c + " was removed");
    }
}
