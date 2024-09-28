package az.edu.turing.module01.lesson2;

import java.util.Comparator;

public class PlayerComparatorByScore implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.compareTo(o2);
    }
}
