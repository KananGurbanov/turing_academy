package az.edu.turing.MyApps.HappyFamilyProjectNew;

import az.edu.turing.MyApps.HappyFamilyProjectNew.Family;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FamilyProjectApp {
    public static void main(String[] args) throws ParseException {

        List<Human> children = new ArrayList<>();
        Human father1 = new Human("Yazil", "Babayev","20/03/1990", 120);

        Family family1 = new Family(father1, new Human(), new ArrayList<>(), new Pet());

        father1.getSchedule().put(DayofWeek.MONDAY, "Walking");

        System.out.println(father1.getSchedule());

        System.out.println(father1);

        System.out.println(family1.getChildren());


        FamilyDAO f = new FamilyDAO();

        f.saveFamily(family1);

        System.out.println(f.getAllFamilies());

        System.out.println(family1);
        


    }
}
