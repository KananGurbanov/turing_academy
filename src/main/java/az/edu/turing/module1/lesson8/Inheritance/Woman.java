package az.edu.turing.module1.lesson8.Inheritance;

public class Woman extends Human implements SportsHuman {
    private double estrogenLevel;

    public Woman(String name, int age, double height, double estrogenLevel) {
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
        System.out.println("Woman is doing workout....");
    }
}
