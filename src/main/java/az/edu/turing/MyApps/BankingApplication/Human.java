package az.edu.turing.MyApps.BankingApplication;

import java.util.ArrayList;

public class Human {
    private final String name;

    private final int age;

    private ArrayList<BankAccount> accounts;

    private Wallet wallet;

    public boolean haveBankAccount;

    public Human(String name, int age, Wallet wallet) {
        this.name = name;
        this.age = age;
        accounts = new ArrayList<BankAccount>();
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accounts=" + accounts +
                ", wallet=" + wallet +
                '}';
    }
}
