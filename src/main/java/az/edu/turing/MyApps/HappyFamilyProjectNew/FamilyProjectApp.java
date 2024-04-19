package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.text.ParseException;
import java.util.ArrayList;

public class FamilyProjectApp {
    public static void main(String[] args) throws ParseException {


        Man father1 = new Man("Yazil", "Babayev", "20/03/1990", 120);

        Family family1 = new Family(father1, new Woman(), new ArrayList<>(), new Pet());

        Family family2 = new Family(new Man("Fail", "gasimov", 2978693), new Woman(), new ArrayList<>(), new Pet("Toplan"));




        CollectionFamilyDAO f = new CollectionFamilyDAO();

        f.saveFamily(family1);

        f.saveFamily(family2);

        System.out.println(f.getAllFamilies());

        f.displayAllFamilies();

        System.out.println(f.bornChild(family1, "FEMININE"));


    }


}
