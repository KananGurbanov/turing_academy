package az.edu.turing.MyApps.BankingApplication;



public class LoanDepartment {
    public void giveLoan(Human h, BankAccount b, double amount){
        if(h.haveBankAccount){
            b.setBalance(b.getBalance() + amount);

            b.setLoan(b.getLoan() + amount);

            System.out.println(amount + " loan was given to your account : " + b);
        }
        else{
            System.out.println("You do not have a bank account");
        }
    }

    public void giveLoan(Human h, CreditCard c, double amount){
        if(h.getWallet().haveCreditCard){
            c.setBalance(c.getBalance() + amount);

            c.setLoan(c.getLoan() + amount);

            System.out.println(amount + " loan was given to your credit card : " + c);
        }

        else{
            System.out.println("You do not have a credit card");
        }
    }
}
