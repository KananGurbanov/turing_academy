package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.text.ParseException;
import java.util.Map;

public final class Man extends Human{

    public Man(String name, String surname, long year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, String birthDate, int iq) throws ParseException {
        super(name, surname, birthDate, iq);
    }

    public Man(String name, String surname, long year, int iq, Map<DayofWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Man(String name, String surname, long year, Family family) {
        super(name, surname, year, family);
    }

    public Man(String name, String surname, Family family) {
        super(name, surname, family);
    }

    public Man() {
    }

    public void repairCar(){}
}
