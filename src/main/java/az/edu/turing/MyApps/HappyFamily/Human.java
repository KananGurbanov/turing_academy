package az.edu.turing.MyApps.HappyFamily;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Human {
    private String name;

    private String surname;

    private int birthDate;

    private int iq;

    private Map<DayofWeek, String> schedule;

    private Family family;


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.birthDate = year;
        schedule = new HashMap<>(7);
    }



    public Human(String name, String surname, String birthDateStr, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(birthDateStr);
        this.setYear((int) date.getTime());
        this.iq=iq;
}

    public Human(String name, String surname, int year, int iq, Map<DayofWeek, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, int year, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = year;
        this.family = family;
        schedule = new HashMap<>(7);
    }

    public Human(String name, String surname, Family family) {
        this.name = name;
        this.surname = surname;
        this.family = family;
    }

    public Human() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setYear(int year) {
        this.birthDate = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<DayofWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayofWeek, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String describeAge() {
        long now = System.currentTimeMillis();
        long ageInMillis = now - birthDate;
        Calendar ageCal = Calendar.getInstance();
        ageCal.setTimeInMillis(ageInMillis);
        int years = ageCal.get(Calendar.YEAR) - 1970;
        int months = ageCal.get(Calendar.MONTH);
        int days = ageCal.get(Calendar.DAY_OF_MONTH) - 1;
        return String.format("%d years, %d months, %d days", years, months, days);
    }

    public int getBirthYear() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date(birthDate);
        return Integer.parseInt(dateFormat.format(date));
}

    public void greetPet(int index){
        System.out.println("Hello, " + family.getPets());
    }

    public void describePet(){

        System.out.println("I have an " + family.getPets()+ ". It is " + family.getPets() + ". ");
    }



    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + birthDate +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
}
