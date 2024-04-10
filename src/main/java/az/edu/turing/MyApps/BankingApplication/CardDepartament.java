package az.edu.turing.MyApps.BankingApplication;

public interface CardDepartament {
    static void giveDebitCard(Human human){
        human.getCards().add(new DebitCard());


    }
}
