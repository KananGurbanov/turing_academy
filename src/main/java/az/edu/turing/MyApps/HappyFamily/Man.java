package az.edu.turing.MyApps.HappyFamily;

import java.text.ParseException;
import java.util.Map;

public final class Man extends Human {


    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, String birthDateStr, int iq) throws ParseException {
        super(name, surname, birthDateStr, iq);
    }

    public Man(String name, String surname, int year, int iq, Map<DayofWeek, String> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public Man(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    public Man(String name, String surname, Family family) {
        super(name, surname, family);
    }

    public Man() {
    }

    public void repairCar(){}

    @Override
    public String toString() {
        return "{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", year=" + getBirthYear() +
                ", iq=" + getIq() +
                ", schedule=" + getSchedule() +
                ", gender='man'" +
                '}';
    }
}
