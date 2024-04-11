package az.edu.turing.module01.part1.lesson3;

public interface HumanCreator {

    int PIN = 2004;

    void bornChild();

    default void func(){
        System.out.println("Smith");
    }

    static void foo(){
        System.out.println("123");
    }



}
