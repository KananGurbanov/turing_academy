package az.edu.turing.MyApps.BankApplication;

import java.util.ArrayList;

public class Human {
    private final String name;

    private final int age;

    private Wallet wallet;

    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public boolean haveBankAccount;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, Wallet wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
}
