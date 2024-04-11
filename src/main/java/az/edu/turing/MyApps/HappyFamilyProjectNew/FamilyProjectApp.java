package az.edu.turing.MyApps.HappyFamilyProjectNew;

import az.edu.turing.module01.part1.lesson3.DayofWeek;
import az.edu.turing.module01.part1.lesson3.Species;

import java.util.HashMap;

public class FamilyProjectApp {
    public static void main(String[] args) {


        Human father1 = new Human("Yazil", "Babayev", 1970,100,new Pet(),new Human(),new Human(), new HashMap<>());


        father1.getSchedule().put(DayofWeek.MONDAY, "Walking");







    }
}
