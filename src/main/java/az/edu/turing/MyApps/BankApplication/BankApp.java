package az.edu.turing.MyApps.BankApplication;

public class BankApp {
    public static void main(String[] args) {
        Human kanan = new Human("Koten", 19,new Wallet(8));

        Bank bank = new Bank();

        bank.addToCustomerList(kanan);

        bank.newAccount(kanan);

        bank.giveCreditCard(kanan, CardType.KAPITAL);

        bank.giveDebitCard(kanan, CardType.ABB);

        bank.giveLoan(kanan,kanan.getAccounts().get(0),100);
    }
}
