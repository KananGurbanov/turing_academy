package az.edu.turing.MyApps.BankingApplication;

import java.util.ArrayList;
import java.util.List;

public class Bank extends Currency implements HumanResources, Transactions, LoanDepartment, CardDepartment, AccountDepartment {

    private int numCustomers;

    private int numWorkers = 0;

    private List<Human> workers;

    private ArrayList<Human> customerList;

    public Bank() {
        customerList = new ArrayList<>();
        workers = new ArrayList<>();
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

    @Override
    public void recruit(Human h) {
        this.getWorkers().add(h);
        this.numWorkers++;
    }

    @Override
    public void dismiss(Human h) {
        this.getWorkers().remove(h);
        numWorkers--;
    }

    public List<Human> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Human> workers) {
        this.workers = workers;
    }
}
