package az.edu.turing.MyApps.BankingApplication;

public class BankApp {
    public static void main(String[] args) {


        Human kanan = new Human("Coteen",19,new DebitCard(100),new BankAccount(150));

        System.out.println(Bank.numAccounts);

        CardDepartment.giveDebitCard(kanan);

        LoanDepartment.giveLoan(kanan, kanan.getBankAccounts().get(0), 200);

        CardDepartment.giveDebitCard(kanan);

        LoanDepartment.giveLoan(kanan, kanan.getCards().get(1), 100);

        System.out.println(kanan.getCards());

        System.out.println(kanan.getBankAccounts());



    }
}
