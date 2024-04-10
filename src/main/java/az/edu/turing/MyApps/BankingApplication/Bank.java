package az.edu.turing.MyApps.BankingApplication;

import java.util.ArrayList;

public class Bank implements LoanDepartment, CardDepartament {

    public static int numCustomers = 0;
    public ArrayList<Human> set = new ArrayList<>();



    public void newCustomer(Human human){
        numCustomers++;
        this.set.add(human);
    }

    @Override
    public void giveLoan(Human human, int quantity) {
        human.setDeposit(human.getDeposit() + quantity);
    }

    public void giveDebitCard(Human human){
        if(!human.haveDebitCard){
            System.out.println("Debit card is given");
            human.haveDebitCard = true;
            human.setCard(new DebitCard());
        }
        else{
            System.out.println("You already have it");
        }
    }
}
