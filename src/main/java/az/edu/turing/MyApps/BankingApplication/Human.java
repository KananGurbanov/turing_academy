package az.edu.turing.MyApps.BankingApplication;

import java.util.ArrayList;

public class Human {

    private String nickName;

    private int age;

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    private ArrayList<DebitCard> cards = new ArrayList<>();

    public boolean haveDebitCard;

    public boolean havebankAccount;

    public Human(String nickName, int age) {
        this.nickName = nickName;
        this.age = age;
        this.havebankAccount = false;
        this.haveDebitCard = false;
    }

    public Human(String nickName, int age, BankAccount account) {
        this.nickName = nickName;
        this.age = age;
        this.bankAccounts.add(account);
        this.havebankAccount = true;
        Bank.numAccounts++;
    }

    public Human(String nickName, int age, DebitCard card) {
        this.nickName = nickName;
        this.age = age;
        this.haveDebitCard = true;
        this.cards.add(card);
    }

    public Human(String nickName, int age, DebitCard card, BankAccount account) {
        this.nickName = nickName;
        this.age = age;
        this.bankAccounts.add(account);
        this.cards.add(card);
        Bank.numAccounts++;
        this.havebankAccount = true;
        this.haveDebitCard = true;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public ArrayList<DebitCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<DebitCard> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Human{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", bankAccounts=" + bankAccounts +
                ", cards=" + cards +
                ", haveDebitCard=" + haveDebitCard +
                ", havebankAccount=" + havebankAccount +
                '}';
    }
}
