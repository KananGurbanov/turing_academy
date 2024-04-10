package az.edu.turing.MyApps.BankingApplication;

import java.util.ArrayList;

public class Bank implements LoanDepartment, CardDepartament {

    public static int numAccounts = 0;
    public static ArrayList<Human> customerList = new ArrayList<>();



    public static void newAccount(Human human){
        numAccounts++;
        customerList.add(human);
        human.getBankAccounts().add(new BankAccount());
        human.havebankAccount = true;
    }




}
