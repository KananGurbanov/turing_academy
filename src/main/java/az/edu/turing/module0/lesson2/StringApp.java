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

        for(int i=0; i<array.length; i++){

            if(array[i] > first) {
                second = first;
                first = array[i];
            }

            else if (array[i] > second && array[i] != first) {
                second = array[i];
            }
        }

        System.out.println(first + " " + second);
    }
}
