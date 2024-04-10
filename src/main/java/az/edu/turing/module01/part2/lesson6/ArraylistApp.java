package az.edu.turing.module01.part2.lesson6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArraylistApp {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);

        arr.add(5);

        arr.add(7);

        System.out.println(arr);

        System.out.println(arr.get(1));

        arr.remove(0);

        System.out.println(arr);

        System.out.println(arr.get(1));
    }
}
