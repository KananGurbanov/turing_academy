package az.edu.turing.module01.lesson3;

public class FamilyProjectApp {
    public static void main(String[] args) {
        Pet pet1 = new Pet("buldok","toplan",1,60,new String[] {"jump","sit","run"});
        Human mother1 = new Human("Jeremy","Blat",1940);
        Human father1 = new Human("Yazil","Seferov",1939);
        Human child1 = new Human("Mike","Tyson",1966,100,pet1,mother1,father1,new String[][] {});
        System.out.println(pet1);
        System.out.println(mother1);
        System.out.println(father1);
        System.out.println(child1);
    }
}
