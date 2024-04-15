package az.edu.turing.MyApps.BankingApplication;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();


        Human kanan = new Human("Kanan",19,new Wallet(150));

        bank.newCustomer(kanan);

        bank.addNewAccount(kanan);

        bank.addNewAccount(kanan);

        bank.giveLoan(kanan, kanan.getAccounts().get(0), 200);

        bank.deleteAccount(kanan,kanan.getAccounts().get(1));

        bank.giveCreditCard(kanan, Company.KAPITAL);

        bank.giveDebitCard(kanan, Company.ABB);

        bank.giveDebitCard(kanan, Company.UNKNOWN);

        System.out.println(kanan);

        bank.giveLoan(kanan.getWallet().getCards().get(1),100);

        bank.addBalance(kanan, (DebitCard) kanan.getWallet().getCards().get(1), 100);

        bank.sendMoney(kanan.getWallet().getCards().get(1), kanan.getAccounts().get(0), 100);

        bank.addBalance(kanan, (DebitCard) kanan.getWallet().getCards().get(1), 110);

        System.out.println(kanan);

        

    }
}
