package az.edu.turing.MyApps.BankingApplication;

import java.util.ArrayList;

public class Bank {
    public LoanDepartment loanDepartment;

    public CardDepartment cardDepartment;

    public TransactionDepartment transactionDepartment;

    public AccountDepartment accountDepartment;

    private int numCustomers;

    private ArrayList<Human> customerList;

    public Bank() {
        loanDepartment = new LoanDepartment();
        cardDepartment = new CardDepartment();
        transactionDepartment = new TransactionDepartment();
        accountDepartment = new AccountDepartment();
        customerList = new ArrayList<>();
    }

    public void newCustomer(Human h){
        customerList.add(h);
        numCustomers++;
        System.out.println("New customer was added\nNumber of customers : " + numCustomers);
    }

    public int getNumCustomers() {
        return numCustomers;
    }

    public void setNumCustomers(int numCustomers) {
        this.numCustomers = numCustomers;
    }

    public ArrayList<Human> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Human> customerList) {
        this.customerList = customerList;
    }
}
