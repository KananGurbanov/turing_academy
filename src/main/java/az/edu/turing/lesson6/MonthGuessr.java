package az.edu.turing.lesson6;

import java.util.Scanner;

public class MonthGuessr {

    public static void main(String[] args){
        int month = new Scanner(System.in).nextInt();

        if (month >12 || month<1){
            System.out.println("Wrong Input!!!");

        }

        else{
            if ( month >=2 && month <= 5) {
                System.out.println("Spring");
            }

            else if ( month >= 6 && month <= 8) {
                    System.out.println();
            }
            else if ( month >= 9 && month <=11) {
                System.out.println("Fall");
            }

            else {
                System.out.println("Winter");
            }

        }


    }

}
