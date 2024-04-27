package az.edu.turing.MyApps.HappyFamily;

import java.util.Map;

public final class Man extends Human {


    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
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
                ", year=" + getYear() +
                ", iq=" + getIq() +
                ", schedule=" + getSchedule() +
                ", gender='man'" +
                '}';
    }
}
