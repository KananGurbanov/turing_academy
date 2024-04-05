package az.edu.turing.module01.part2.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class PlayerApp {

    public static void mainV1(String[] args) {



        Player[] players = {new Player ("alexa", 150),
                new Player ("amaji", 75),
                new Player ("her", 50),
                new Player ("amy", 100),
                new Player ("david", 100),

        };


        Arrays.sort(players);




//        for (int i = 0; i<4;i++){
//            for (int j = 0; j<4-i;j++){
//                if(players[i].compareTo(players[i+1]) == 1){
//                    Player temp = players[i];
//                    players[i] = players[i+1];
//                    players[i+1] = temp;
//                }
//            }
//        }

        for (int i = 0; i<5;i++){
            System.out.println(players[i].name +", " + players[i].score);
        }





    }

    public static void main(String[] args) {
        Player[] players = new Player[]{
                new Player("amy", 100),
                new Player("david", 100),
                new Player("heraldo", 50),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("aleksa", 150),
        };


        Arrays.sort(players,new PlayerComparatorByName());

        System.out.println(Arrays.toString(players));

        Player p = new Player("dff",23);

        System.out.println(p.toString());


    }
}
