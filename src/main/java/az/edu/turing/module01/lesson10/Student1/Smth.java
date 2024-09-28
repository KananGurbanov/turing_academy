package az.edu.turing.module01.lesson10.Student1;

import java.util.ArrayList;
import java.util.List;

public class Smth {
    private final String name;

    public static int s = 10;

    private final int age;

    public Smth(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int get(int f){
        return f;
    }


    public static void main(String[] args) {
        Smth s = new Smth("Kanan", 19);

        System.out.println(s.age);

        System.out.println(s.get(5));

        String [] n = new String[5];

        System.out.println(n[3]);

        final List<Integer> list = new ArrayList<>();

        list.add(13);




    }

}
