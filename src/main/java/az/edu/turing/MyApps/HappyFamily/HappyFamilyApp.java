package az.edu.turing.MyApps.HappyFamily;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyFamilyApp {
    public static void main(String[] args) {


        Family family = new Family(new Man("Yazil", "Jackson",1970), new Woman("Fazila", "Jackson",1973), new ArrayList<Human>(){{add(new Man("Kanan","Gurbanov", 12004234)); add(new Woman("Leyla","Sixlinskaya",200423423));}}, new HashSet<>(){{add(new Pet("Toplan"));}});

        Family family1 = new Family(new Man("Barel", "Babayev", 1980), new Woman("Barella", "Babayeva", 1983), new ArrayList<>() {{add(new Woman("Gozal", "Babayeva", 2000));}}, new HashSet<>() {{add(new Pet("Chubush"));}});

        CollectionsFamilyDAO c = new CollectionsFamilyDAO();

        FamilyService familyService = new FamilyService(c);

        FamilyController familyController = new FamilyController(familyService);

        c.saveFamily(family);

        c.saveFamily(family1);

        familyController.displayAllFamilies();

        System.out.println(familyController.getFamiliesBiggerThan(3));

        System.out.println(familyController.getFamiliesLessThan(4));

        Family newFamily = familyController.createNewFamily(new Woman("Inara", "Babayeva", 1946), new Man("Tofig", "Taghizadeh", 1940));


        System.out.println("Before deleting: ");
        System.out.println(c.getAllFamilies());

        System.out.println("After deleting");

        boolean deleted = c.deleteFamily(0);

        System.out.println(c.getAllFamilies());

        System.out.println("Family after new child born :");

        System.out.println(c.bornChild(c.getFamilyByIndex(0), "Aydan", "woman"));

        System.out.println("Family after a child adopted :");

        System.out.println(c.adoptChild(c.getFamilyByIndex(0),new Human("Smth", "Smthov",1999)));

        System.out.println("Deleting children over 18 :");

        familyController.deleteAllChildrenOlderThan(18);


        familyService.loadData(c.getAllFamilies());

        while (true) {
            printMenu();
            String command = new Scanner(System.in).nextLine().trim();

            try {
                switch (command) {
                    case "1":
                        //fillTestData();
                        break;
                    case "2":
                        familyController.displayAllFamilies();
                        break;
                    case "3":
                        System.out.println(familyController.getFamiliesBiggerThan(3));;
                        break;
                    case "4":
                        System.out.println(familyController.getFamiliesLessThan(4));;
                        break;
                    case "5":
                        System.out.println(familyController.countFamiliesWithMemberNumber(3));;
                        break;
                    case "6":
                        familyController.createNewFamily(new Woman("Naila","Allahverdiyeva",		10327378),new Man("Nicat","Aliyev",1232));
                        break;
                    case "7":
                        System.out.print("Enter the index of the family to delete: ");
                        int indexToDelete = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        System.out.println(c.deleteFamily(indexToDelete));
                        break;
                    case "8.1":
                        System.out.println(familyController.bornChild(c.getFamilyByIndex(0), "Salim", "man"));
                        break;
                    case "8.2":
                        System.out.println(familyController.adoptChild(c.getFamilyByIndex(0),new Human("Stakan","Nelbeki",2002)));
                        break;
                    case "9":
                        familyController.deleteAllChildrenOlderThan(18);
                        break;
                    case "exit":
                        System.out.println("Exiting Family Management System. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid command. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }




    }

    private static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Fill with test data");
        System.out.println("2. Display the entire list of families");
        System.out.println("3. Display families with more members than specified");
        System.out.println("4. Display families with fewer members than specified");
        System.out.println("5. Calculate number of families by member count");
        System.out.println("6. Create a new family");
        System.out.println("7. Delete a family");
        System.out.println("8.1 Give a birth to family");
        System.out.println("8.2 Adopt a child to family");
        System.out.println("9. Remove all children over a certain age");
        System.out.println("Type 'exit' to quit");
        System.out.print("Enter your choice: ");
    }
}
