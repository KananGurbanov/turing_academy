package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Human {
    private String name;

    private String surname;

    private long birthDateMillis;

    private int iq;

    private Map<DayofWeek, String> schedule;

    private Family family;


    public Human(String name, String surname, long year) {
        this.name = name;
        this.surname = surname;
        this.birthDateMillis = year;
        schedule = new HashMap<>(7);
    }

    public Human(String name, String surname, String birthDate, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(birthDate);
        this.birthDateMillis = date.getTime();
        this.iq = iq;
        this.schedule = new HashMap<>();
    }





    public Human(String name, String surname, long year, int iq, Map <DayofWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDateMillis = year;
        this.iq = iq;

        this.schedule = schedule;
    }

    public Human(String name, String surname, long year, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDateMillis = year;
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

    public String getYear() {
        return describeAge();
    }

    public void setYear(long year) {
        this.birthDateMillis = year;
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

    public void greetPet(){
        System.out.println("Hello, " + family.getPet().getNickname());
    }

    public void describePet(){

        System.out.println("I have an " + family.getPet().getSpecies() + ". It is " + family.getPet().getAge() + ". ");
    }
    public String describeAge() {
        long currentTimeMillis = System.currentTimeMillis();
        long ageMillis = currentTimeMillis - birthDateMillis;
        long years = ageMillis / (1000L * 60 * 60 * 24 * 365);
        long months = (ageMillis % (1000L * 60 * 60 * 24 * 365)) / (1000L * 60 * 60 * 24 * 30);
        long days = ((ageMillis % (1000L * 60 * 60 * 24 * 365)) % (1000L * 60 * 60 * 24 * 30)) / (1000L * 60 * 60 * 24);
        return years + " years, " + months + " months, " + days + " days";

    }

    @Override


    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(birthDateMillis);
        return "Name: " + name + ", Surname: " + surname + ", Birth Date: " + sdf.format(calendar.getTime()) + ", IQ: " + iq;
    }
}
