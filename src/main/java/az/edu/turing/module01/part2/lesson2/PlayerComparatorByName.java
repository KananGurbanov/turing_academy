package az.edu.turing.module01.part2.lesson2;

import java.util.Comparator;

public class PlayerComparatorByName implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.name.compareTo(o2.name);
    }
}



