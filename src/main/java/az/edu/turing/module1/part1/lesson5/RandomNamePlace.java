package az.edu.turing.module1.part1.lesson5;

import java.util.Random;

public class RandomNamePlace {
    public static void main(String[] args) {


        String[] names = {"Kanan", "Ilham(o7)", "Nurlan", "Aydan", "Selen", "Farid K", "Aybeniz", "Nazrin", "Bashir", "Vusal", "Farid H", "Osman", "Eldar", "Bahruz", "Taleh", "Ali", "Leyla"};

        shuffleNames(names);


        for (int i = 0; i < names.length; i++) {
            int randomNumber = i + 1;
            System.out.println(randomNumber + ". " + names[i]);
        }
    }

    public static void shuffleNames(String[] names) {

        Random rand = new Random();


        for (int i = names.length - 1; i > 0; i--) {

            int randomIndex = rand.nextInt(i + 1);

            String temp = names[i];
            names[i] = names[randomIndex];
            names[randomIndex] = temp;
        }
    }



}
