package az.edu.turing.module1.lesson2;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {

    public static void mainV1(String[] args) {



        Player[] players = {new Player ("alexa", 150,2),
                new Player ("amaji", 75,4),
                new Player ("her", 50,3),
                new Player ("amy", 100,5),
                new Player ("david", 100,6),

        };


        Arrays.sort(players);

        System.out.println(Arrays.toString(players));









    }

    public static void main(String[] args) {
        Player[] players = new Player[]{
                new Player("amy", 100,1),
                new Player("david", 100,2),
                new Player("heraldo", 50,3),
                new Player("heraldo", 50,5),
                new Player("aakansha", 75,4),
                new Player("aleksa", 150,7),
        };



        Integer [] n = new Integer[4];




//        Arrays.sort(players, new Comparator<Player>(){
//            @Override
//            public int compare(Player o1, Player o2) {
//                return o1.id - o2.id;
//            }
//        });


        Comparator<Player> p = (p1,p2) -> (p1.id - p2.id);


        Arrays.sort(players, (p1,p2) -> (p1.id - p2.id));


        System.out.println(Arrays.toString(players));




    }

    public static void mainV3(String[] args) {

        Player[] players = new Player[]{
                new Player("amy", 100,1),
                new Player("david", 100,2),
                new Player("heraldo", 50,3),
                new Player("heraldo", 50,5),
                new Player("aakansha", 75,4),
                new Player("aleksa", 150,7),
        };


        Arrays.sort(players,new PlayerComparatorByName());

        System.out.println(Arrays.toString(players));

    }
}
