package az.edu.turing.module01.part1.lesson8;

public class Man extends Human implements SportsHuman {
    private double estrogenLevel;

    public Man(String name, int age, double height, double estrogenLevel) {
        super(name, age, height);
        this.estrogenLevel = estrogenLevel;
    }

    public double getEstrogenLevel() {
        return estrogenLevel;
    }

    public void setEstrogenLevel(double estrogenLevel) {
        this.estrogenLevel = estrogenLevel;
    }


    @Override
    public void workout() {
        System.out.println("Man is doing workout....");
    }
}
