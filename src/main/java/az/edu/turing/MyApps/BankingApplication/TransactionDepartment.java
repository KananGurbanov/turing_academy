package az.edu.turing.MyApps.BankingApplication;


public class TransactionDepartment {
    public void addBalance(CreditCard c, double amount){
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
    }

    public void addBalance(DebitCard c, double amount){
        c.setBalance(c.getBalance() + amount);
    }

    public void addBalance(BankAccount b, double amount){
        if(b.getLoan() > 0){
            if(b.getLoan() < amount ){

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
    }

    public void withdraw(Card c, double amount){
        if(c.getBalance() < amount){
            System.out.println("You do not have enough balance");

        }
        else{
            c.setBalance(c.getBalance() - amount);
        }
    }


    public void withdraw(BankAccount b, double amount){
        if(amount > b.getBalance()){
            System.out.println("You do not have enough balance");
        }
        else{
            b.setBalance(b.getBalance() - amount);
        }
    }

    public void sendMoney(Card c1, Card c2, double amount){
        if(amount > c1.getBalance()){
            System.out.println("You cannot send that amount");

        }

        else{
            c2.setBalance(c2.getBalance() + amount);

            c1.setBalance(c1.getBalance() - amount);

            System.out.println(amount + " was sent from " + c1 + " to " + c2);
        }
    }

    public void sendMoney(Card c1, BankAccount b, double amount){
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
