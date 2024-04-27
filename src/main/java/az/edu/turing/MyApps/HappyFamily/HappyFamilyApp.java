package az.edu.turing.MyApps.HappyFamily;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyFamilyApp {
    public static void main(String[] args) {
        Man father1 = new Man("Kanan", "Gurbanov", 2004);

        Woman mother1 = new Woman("Unknown", "Unknown", 200);

        Family family = new Family(father1, mother1,new ArrayList<Human>(){{add(new Man("Kanan","Gurbanov", 2004));}},new HashSet<>());

        System.out.println(family.getChildren());

        CollectionsFamilyDAO c = new CollectionsFamilyDAO();

        c.saveFamily(family);

        FamilyService familyService = new FamilyService(c);

        FamilyController familyController = new FamilyController(familyService);

        familyController.displayAllFamilies();


    }
}
