package az.edu.turing.MyApps.BankingApplication;

public interface LoanDepartment {
    static void giveLoan(Human h, BankAccount account, int loan){
        if(h.haveDebitCard){
            System.out.println(loan + " amount was added to your " + account);
            account.addBalance(loan);
            account.loan += loan;
        }
        else{
            System.out.println("You do not have an account available");
        }
    }

    static void giveLoan(Human h, DebitCard card, int loan){
        if(h.haveDebitCard){
            System.out.println(loan + " amount was added to your " + card);
            card.addAmount(loan);
            card.loan += loan;
        }
        else{
            System.out.println("You do not have a card available");
        }

    }



}
