package az.edu.turing.MyApps.HappyFamilyProjectNew;

import az.edu.turing.MyApps.HappyFamilyProjectNew.Species;

import java.util.Arrays;
import java.util.Set;

public class Pet {
    private Species species;

    private String nickname;

    private int age;

    private int trickLevel;

    private Set<String> habits;

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet( String nickname, int age, int trickLevel, Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {}

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

    public void eat(){
        System.out.println("I'm eating");
    }

    public void respond(){
        System.out.println("Hello, owner, I'm " + nickname + ". I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }



}
