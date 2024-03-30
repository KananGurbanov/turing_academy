package az.edu.turing.module01.part1.lesson3;

import java.util.Arrays;

public class FamilyProjectApp {
    public static void main(String[] args) {
        Pet pet1 = new Pet(Species.QAFQAZCOBANITI,"toplan",1,60,new String[] {"jump","sit","run"});
        Human mother1 = new Human("Jeremy","Blat",1940);
        Human father1 = new Human("Yazil","Seferov",1939);
        Human child1 = new Human("Mike","Tyson",1966,100,new String[][] {});
        Human child2 = new Human("M3ke","Tysfn",1466,100,new String[][] {});
        Human child3 = new Human("M5ke","Tys5n",1366,100,new String[][] {});


        Family f1 = new Family(mother1,father1,new Human[] {child1,child2},pet1);

        System.out.println(f1.getChildren());

        f1.addchild(child3);

        System.out.println(f1.getChildren());

        f1.deleteChild(1);

        System.out.println(f1.getChildren());


//        System.out.println(pet1);
//        System.out.println(mother1);
//        System.out.println(father1);
//        System.out.println(child1);
    }
}
