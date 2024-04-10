package az.edu.turing.MyApps.BankingApplication;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Human kanan = new Human(100,"Coteen", 19, 200);

        bank.newCustomer(kanan);

        System.out.println(Bank.numCustomers);

        bank.giveLoan(kanan, 100);

        System.out.println(kanan.getDeposit());

        bank.giveDebitCard(kanan);

        kanan.getCard().addAmount(300);

        System.out.println(kanan.getCard().getAmount());

    }
}
