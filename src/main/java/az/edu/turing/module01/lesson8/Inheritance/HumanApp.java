package az.edu.turing.module01.lesson8.Inheritance;

public class HumanApp {

    public static void main(String[] args) {
        Man man1 = new Man("Kanan", 19,1.85,90);

        man1.workout();

        SportsHuman.train();
    }
}
