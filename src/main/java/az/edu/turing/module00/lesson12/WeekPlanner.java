package az.edu.turing.module00.lesson12;

import java.util.Scanner;


public class WeekPlanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String [][] schedule = new String[7][2];

        schedule[0][0] = "Monday";
        schedule[0][1] = "go to gym; go to turing";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "have a day-off";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "go on jogging";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "attend uni event";
        schedule[4][0] = "Friday";
        schedule[4][1] = "go on swimming";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "go to playing football";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "work on project";

        String weekday;

        for (int i = 0; i < 7; i++){
            System.out.print("Please, enter the weekday : ");

            weekday = in.next();

            int flag = 0;
            for (int k = 0; k<7; k++){
                if (weekday.equalsIgnoreCase(schedule[k][0])){
                    System.out.println("Your tasks for " + schedule[k][0] + ": " + schedule[k][1]);
                    flag = 1;
                    break;
                }
            }

            if (flag == 0){
                System.out.println("Sorry, I don't understand you");
            }

        }



    }
}
