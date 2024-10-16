package az.edu.turing.module1.lesson6.DataStructures.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApp {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        TreeSet<Integer> objects = new TreeSet<>();


        set.add(3);
        set.add(null);
        set.add(5);

        set.add(1);
        set.add(7);
        set.add(6);
        set.add(6);
        set.add(null);
        System.out.println(set);

    }
}
