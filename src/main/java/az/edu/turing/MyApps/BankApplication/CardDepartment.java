package az.edu.turing.MyApps.BankApplication;

public interface CardDepartment {
    default void giveDebitCard(Human h, CardType type){
        DebitCard c = new DebitCard(type);

        h.getWallet().getCards().add(c);

        h.getWallet().haveDebitCard = true;

        System.out.println("New debit card was given " + c);
    }

    default void giveCreditCard(Human h, CardType type){
        CreditCard c = new CreditCard(type);

        h.getWallet().getCards().add(c);
        h.getWallet().haveCreditCard = true;

        System.out.println("New credit card vas given " + c);
    }
}
