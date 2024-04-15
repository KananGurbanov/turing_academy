package az.edu.turing.MyApps.BankingApplication;



public interface LoanDepartment {
    default void giveLoan(Human h, BankAccount b, double amount){
        if(h.haveBankAccount){
            b.setBalance(b.getBalance() + amount);

            b.setLoan(b.getLoan() + amount);

            System.out.println(amount + " loan was given to your account : " + b);
        }
        else{
            System.out.println("You do not have a bank account");
        }
    }

    default void giveLoan(Card c, double amount){

        if(c instanceof CreditCard){

            c.setBalance(c.getBalance() + amount);

            ((CreditCard) c).setLoan(((CreditCard) c).getLoan() + amount);

            System.out.println(amount + " loan was given to your credit card : " + c);
        }

        else{
            System.out.println("It isn't a credit card");
        }
    }


}
