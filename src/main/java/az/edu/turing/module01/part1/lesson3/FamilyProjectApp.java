package az.edu.turing.module01.part1.lesson3;

import java.util.Arrays;

public class FamilyProjectApp {
    public static void main(String[] args) {
        Pet fish1 = new Fish(Species.AKULA, "ravi");
        Human mother1 = new Human("Jeremy","Blat",1940);
        Human father1 = new Human("Yazil","Seferov",1939);
        Human child1 = new Human("Mike","Tyson",1966,100,new String[][] {});
        Human child2 = new Human("M3ke","Tysfn",1466,100,new String[][] {});
        Human child3 = new Human("M5ke","Tys5n",1366,100,new String[][] {});
        Human child4 = new Human("M7ke","Tys7n",1766,10,new String[][] {});



        Family f1 = new Family(mother1,father1, new Human[]{child1, child2, child4}, fish1);

        System.out.println(f1);

        System.out.println(Arrays.toString(f1.getChildren()));

        f1.addchild(child3);

        System.out.println(Arrays.toString(f1.getChildren()));

        f1.deleteChild(1);

        System.out.println(Arrays.toString(f1.getChildren()));


        System.out.println(fish1);
        System.out.println(mother1);
        System.out.println(father1);
        System.out.println(child1);


    }
}
