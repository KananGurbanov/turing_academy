package az.edu.turing.module01.part2.lesson2;

import java.util.Scanner;

public class ComparatorApp {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        Player[] players = {new Player ("alexa", 150),
                new Player ("amaji", 75),
                new Player ("her", 50),
                new Player ("amy", 100),
                new Player ("david", 100),

        };



        for (int i = 0; i<4;i++){
            for (int j = 0; j<4-i;j++){
                if(players[i].compareTo(players[i+1]) == 1){
                    Player temp = players[i];
                    players[i] = players[i+1];
                    players[i+1] = temp;
                }
            }
        }

        for (int i = 0; i<5;i++){
            System.out.println(players[i].name +", " + players[i].score);
        }





    }
}
