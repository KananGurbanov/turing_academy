package az.edu.turing.module01.lesson9.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>() {{
            add(3);
            add(5);
        }};

        list.stream().map((n) -> 2 * n).filter((n) -> n % 2 == 0).forEach(System.out::println);

    }
}
