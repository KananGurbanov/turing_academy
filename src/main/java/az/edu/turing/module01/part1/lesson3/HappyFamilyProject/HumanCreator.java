package az.edu.turing.module01.part1.lesson3.HappyFamilyProject;

public interface HumanCreator {

    int PIN = 2004;

    void bornChild();

    static void foo(){
        System.out.println("123");
    }

    default void func(){
        System.out.println("Smith");
    }

}
