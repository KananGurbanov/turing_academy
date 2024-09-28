package az.edu.turing.module01.lesson2;

import java.util.Objects;

public final class Player implements Comparable< Player>{

    public String name;

    public int score;

    public int id;

    public Player(String Name, int Score, int id) {
        name = Name;
        score = Score;
        this.id = id;
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
        return score > o.score ? 1 : score < o.score ? -1 : name.compareTo(o.name);
    }


}
