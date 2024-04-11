package az.edu.turing.module01.part1.lesson3;

import java.util.Arrays;
import java.util.Objects;

public class Human implements HumanCreator {

    private String name;

    private String surname;

    private int year;

    private int iq;

    private Family family;

    private String[][] schedule;



    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }



    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }



    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;

        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int iq, Family family, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
        this.schedule = schedule;
    }

    public Human(){}

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

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }



    public void greetPet(){
        System.out.println("Hello, " + this.name);
    }

    public void describePet(){
        System.out.println("I have an " + " is "  + " years old ");
    }


    @Override
    public String  toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(family, human.family) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }


    @Override
    public void bornChild() {
        System.out.println(HumanCreator.PIN);
    }

    @Override
    public void func() {
        HumanCreator.super.func();
    }


}
