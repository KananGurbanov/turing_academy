package az.edu.turing.module01.part2.lesson9.StreamApi;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApp {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(){{add(3); add(5);}};

        list.stream().map((n)->2*n).filter((n)->n%2==0).forEach(System.out::println);

    }
}
