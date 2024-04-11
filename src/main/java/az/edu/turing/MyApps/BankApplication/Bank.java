package az.edu.turing.MyApps.BankApplication;

import java.util.ArrayList;

public class Bank implements LoanDepartment, CardDepartment, ATM{
    public  int numAccounts = 0;

    public  ArrayList<Human> customerList = new ArrayList<Human>();

    public void newAccount(Human human){
        numAccounts++;
        for (int i = 0; i< customerList.size();i++){
            if(human.equals(customerList.get(i))){
                addToCustomerList(human);
            }
        }
        human.haveBankAccount = true;
        human.getAccounts().add(new BankAccount());
    }

    public void addToCustomerList(Human h){
        customerList.add(h);
    }
}
