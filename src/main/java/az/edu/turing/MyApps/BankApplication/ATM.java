package az.edu.turing.MyApps.BankApplication;

public interface ATM {
    default void addBalance(Human h, Card c, double amount){
        c.setBalance(c.getBalance() + amount);

        System.out.println(amount + " added to your card : " + c);
    }

    default void withdraw(Human h, Card c, double amount){
        if(c.getBalance() - amount < 0){
            System.out.println("You cannot withdraw " + amount + " : " + c);
        }
        else{
            c.setBalance(c.getBalance() - amount);
            System.out.println(amount + " withdrawn from your card : " + c);
        }
    }

}
