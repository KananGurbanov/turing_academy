package az.edu.turing.module0.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class StringApp {
    public static void main1(String[] args) {
        String name = "Kanan";
        name = "Hello";
        String name2 = "Kanan";
        int a;
        System.out.println();

    }

    public static void main(String[] args) {
        int [] array = {3, 7, 5};

        int first = array[0];
        int second = array[0];

        for (int j : array) {

            if (j > first) {
                second = first;
                first = j;
            } else if (j > second && j != first) {
                second = j;
            }
        }

        System.out.println(first + " " + second);
    }
}
