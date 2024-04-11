package az.edu.turing.MyApps.BankingApplication;

public interface CardDepartment {
    static void giveDebitCard(Human human){
        human.getCards().add(new DebitCard());
        human.haveDebitCard = true;
    }
}
