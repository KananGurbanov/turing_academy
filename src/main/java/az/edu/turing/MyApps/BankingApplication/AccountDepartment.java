package az.edu.turing.MyApps.BankingApplication;

public class AccountDepartment {
    public void addNewAccount(Human h){
        BankAccount b = new BankAccount();
        h.getAccounts().add(b);
        h.haveBankAccount = true;
        System.out.println("A new bank account was added to " + h);
    }

    public void deleteAccount(Human h, BankAccount bankAccount){
        h.getAccounts().remove(bankAccount);

        System.out.println("Bank account " + bankAccount + " was removed from accounts of " + h);
    }


}
