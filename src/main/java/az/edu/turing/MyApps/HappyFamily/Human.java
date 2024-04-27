package az.edu.turing.MyApps.HappyFamily;

import java.util.HashMap;
import java.util.Map;

public class Human {
    private String name;

    private String surname;

    private int year;

    private int iq;

    private Map<DayofWeek, String> schedule;

    private Family family;


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        schedule = new HashMap<>(7);
    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, Map<DayofWeek, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, int year, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

//    public void greetPet(int index){
//        System.out.println("Hello, " + family.getPet().getNickname());
//    }
//
//    public void describePet(){
//
//        System.out.println("I have an " + family.getPet().getSpecies() + ". It is " + family.getPet().getAge() + ". ");
//    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
}
