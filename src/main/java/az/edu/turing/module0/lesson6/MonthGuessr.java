package az.edu.turing.module0.lesson6;

import java.util.Scanner;

public class MonthGuessr {

    public static void main(String[] args){
        int month = new Scanner(System.in).nextInt();

        String [] months = {"January", "February" , "March" , "April" , "May", "June",
        "July", "August", "September", "October" , "November" , "December"};

        System.out.println(months[month-1]);



    }

}
