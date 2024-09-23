package az.edu.turing.module01.part2.lesson6.Collections;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

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
