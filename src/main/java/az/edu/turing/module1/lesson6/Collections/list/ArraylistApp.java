package az.edu.turing.module1.lesson6.Collections.list;

import java.util.ArrayList;

public class ArraylistApp {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2, 12);
        System.out.println(arr.size());
    }
}