package az.edu.turing.MyApps.BankApplication;

import java.util.ArrayList;

public class Wallet {
    private ArrayList<Card> cards = new ArrayList<Card>();

    private double cash;

    public boolean haveDebitCard;

    public boolean haveCreditCard;

    public Wallet(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void addCash(double cash) {
        this.cash += cash;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public double getWholeMoney(){

        double result = 0;
        for (Card c: getCards()){
            result += c.getBalance();
        }

        return result + getCash();
    }


    @Override
    public String toString() {
        return "Wallet{" +
                "cards=" + cards +
                ", cash=" + cash +
                '}';
    }
}