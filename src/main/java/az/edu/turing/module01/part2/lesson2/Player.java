package az.edu.turing.module01.part2.lesson2;

import java.util.Objects;

public final class Player implements Comparable< Player>{

    public String name;

    public int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Player o) {
        return this.score < o.score ? 1 : this.score>o.score ? -1 : this.name.compareTo(o.name);
    }


}
