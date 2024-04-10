package az.edu.turing.MyApps.BankingApplication;

import java.util.ArrayList;

public class Bank implements LoanDepartment, CardDepartament {

    public static int numAccounts = 0;
    public ArrayList<Human> customerList = new ArrayList<>();



    public void newAccount(Human human){
        numAccounts++;
        this.customerList.add(human);
    }




}
