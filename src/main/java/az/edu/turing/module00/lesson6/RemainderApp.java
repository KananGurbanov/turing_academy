package az.edu.turing.module00.lesson6;

import java.util.Scanner;

public class RemainderApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        System.out.println(numberOne % numberTwo);

    }
}
