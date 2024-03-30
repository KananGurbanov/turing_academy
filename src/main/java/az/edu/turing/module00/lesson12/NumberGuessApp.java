package az.edu.turing.module00.lesson12;

import java.util.Random;

import java.util.Scanner;

public class NumberGuessApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = input.next();

        System.out.println("Hello " + name + ". Let the game begin!!!");

        Random random = new Random();

        int number = random.nextInt(0,100);

        int guess;

        while (true){
            System.out.print("Enter your guess: ");

            guess = input.nextInt();

            if (guess>number){
                System.out.println("Too much, try lower");
            }
            else if(guess<number){
                System.out.println("Too low, try bigger");
            }

            else {
                System.out.println("Congratulations " + name + ", you find it. It was " + number);
                break;
            }
        }

    }
}
