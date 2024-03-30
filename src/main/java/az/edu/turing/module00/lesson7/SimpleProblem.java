package az.edu.turing.module00.lesson7;

import java.util.Scanner;

import java.util.Random;

public class SimpleProblem {
    public static void main(String[] args) {
        String[] names = {"Kanan", "Ilham(o7)", "Nurlan", "Aydan", "Selen", "Farid K", "Aybeniz", "Nazrin", "Bashir", "Vusal", "Farid H", "Osman", "Eldar", "Bahruz", "Taleh", "Ali", "Leyla"};

        shuffleNames(names);

        // Print the shuffled names with random numbers (1 to 17)
        for (int i = 0; i < names.length; i++) {
            int randomNumber = new Random().nextInt(17) + 1; // Generates a random number between 1 and 17
            System.out.println(randomNumber + ". " + names[i]);
        }
    }

    private static void shuffleNames(String[] names) {
        Random rand = new Random();

        // Start from the last element and swap one by one
        for (int i = names.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i
            int randomIndex = rand.nextInt(i + 1);

            // Swap names[i] with the element at randomIndex
            String temp = names[i];
            names[i] = names[randomIndex];
            names[randomIndex] = temp;
        }
    }
}

