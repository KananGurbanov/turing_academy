package az.edu.turing.MyApps.BankingApplication;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Human kanan = new Human("Coteen",19,new BankAccount(100));

        bank.newAccount(kanan);

        System.out.println(Bank.numAccounts);

        CardDepartament.giveDebitCard(kanan);

        LoanDepartment.giveLoan(kanan, kanan.getBankAccounts().get(0), 200);

        System.out.println(kanan.getCards());

        System.out.println(kanan.getBankAccounts());



    }
}
