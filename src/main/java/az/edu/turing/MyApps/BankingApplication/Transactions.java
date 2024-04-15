package az.edu.turing.MyApps.BankingApplication;


public interface Transactions {
    default void addBalance(Human h, CreditCard c, double amount){
        if (h.getWallet().getCash() > amount){
            if(c.getLoan() > 0){
                if(c.getLoan() < amount ){
                    c.setBalance(amount - c.getLoan());
                    c.setLoan(0);
                }
                else{
                    c.setLoan(c.getLoan() - amount);
                }
            }
            else{
                c.setBalance(c.getBalance() + amount);
            }
            h.getWallet().setCash(h.getWallet().getCash() - amount);
        }
        else{
            System.out.println("You do not have enough cash");
        }

    }

    default void addBalance(Human h, DebitCard c, double amount){
        if(h.getWallet().getCash() > amount){
            c.setBalance(c.getBalance() + amount);

            h.getWallet().setCash(h.getWallet().getCash() - amount);
        }
        else{
            System.out.println("You do not have enough cash");
        }

    }

    default void addBalance(Human h, BankAccount b, double amount) {
        if (h.getWallet().getCash() > amount) {
            if (b.getLoan() > 0) {
                if (b.getLoan() < amount) {
                    b.setBalance(amount - b.getLoan());
                    b.setLoan(0);
                } else {
                    b.setLoan(b.getLoan() - amount);
                }
            }
            else {
                b.setBalance(b.getBalance() + amount);
            }

            h.getWallet().setCash(h.getWallet().getCash() - amount);
        }
        else{
            System.out.println("You do not have enough cash");
        }

    }



    default void withdraw(Human h, Card c, double amount){
        if(c.getBalance() < amount){
            System.out.println("You do not have enough balance");

        }
        else{
            c.setBalance(c.getBalance() - amount);
            h.getWallet().setCash(h.getWallet().getCash() + amount);
        }
    }


    default void withdraw(Human h, BankAccount b, double amount){
        if(amount > b.getBalance()){
            System.out.println("You do not have enough balance");
        }
        else{
            b.setBalance(b.getBalance() - amount);
            h.getWallet().setCash(h.getWallet().getCash() + amount);
        }
    }

    default void sendMoney(Card c1, DebitCard c2, double amount){
        if(amount > c1.getBalance()){
            System.out.println("You cannot send that amount");

        }

        else{
            c2.setBalance(c2.getBalance() + amount);

            c1.setBalance(c1.getBalance() - amount);

            System.out.println(amount + " was sent from " + c1 + " to " + c2);
        }
    }

    default void sendMoney(Card c1, CreditCard c2, double amount){

        if(amount > c1.getBalance()){
            System.out.println("You cannot send that amount");

        }

        else{
            if (c2.getLoan() > 0) {
                if(amount > c2.getLoan()){
                    c2.setBalance(amount - c2.getLoan());
                    c2.setLoan(0);
                }

                else{
                    c2.setLoan(c2.getLoan() - amount);
                }
            }
            else{
                c2.setBalance(c2.getBalance() + amount);
            }

            c1.setBalance(c1.getBalance() - amount);

            System.out.println(amount + " was sent from " + c1 + " to " + c2);
        }
    }

    default void sendMoney(Card c1, BankAccount b, double amount){
        if(amount > c1.getBalance()){
            System.out.println("You cannot send that amount");

        }

        else{
            if(b.getLoan() > 0){
                if(amount > b.getLoan()){

                    b.setBalance(amount - b.getLoan());
                    b.setLoan(0);
                }
                else{
                    b.setLoan(b.getLoan() - amount);
                }


            }
            else{
                b.setBalance(b.getBalance() + amount);
            }

            c1.setBalance(c1.getBalance() - amount);


            System.out.println(amount + " was sent from " + c1 + " to " + b);
        }
    }






    
}
