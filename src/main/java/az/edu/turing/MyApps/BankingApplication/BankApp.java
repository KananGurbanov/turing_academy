package az.edu.turing.MyApps.BankingApplication;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();


        Human kanan = new Human("Kanan",19,new Wallet(5));

        bank.newCustomer(kanan);

        bank.accountDepartment.addNewAccount(kanan);

        bank.loanDepartment.giveLoan(kanan, kanan.getAccounts().get(0), 200);

        


    }
}
