package az.edu.turing.module00.lesson5;

import java.util.Scanner;

public class fesil {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();

        String monthStr = (month>12 || month <1) ? "wrong input" : (month >=3 && month <=5 ) ? "spring" : (month>=6 && month <=8) ? "summer" : (month>=9 && month<=11) ? "fall" : "winter" ;




        

        System.out.println(monthStr);


    }
}
