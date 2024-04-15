package az.edu.turing.MyApps.BankingApplication;

import java.util.ArrayList;

public class Wallet {
    private ArrayList<Card> cards;

    private double cash;

    public boolean haveDebitCard;

    public boolean haveCreditCard;

    public Wallet(int cash) {
        this.cash = cash;
        cards = new ArrayList<Card>();

    }

    public Wallet(int cash, ArrayList<Card> cards) {
        this.cash = cash;
        this.cards = cards;

    }







    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
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
