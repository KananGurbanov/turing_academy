package az.edu.turing.module01.part1.lesson8.Inheritance;
public interface SportsHuman {
    String GYMNAME = "FITNESS";

    void workout();

    default void run(){
        System.out.println("Running....");
    }

    static void train(){
        System.out.println("Training people at the gym....");
    }

}
