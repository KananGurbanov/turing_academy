package az.edu.turing.module1.lesson9.LambdaExpressionsAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.function.*;

public class FunctionalInterfacesApp {

    public static void main(String[] args) {
        //---------------SUPPLIER INTERFACE--------------
        Supplier<Integer> supplier = () -> 5;

        //---------------CONSUMER INTERFACE----------------
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + s);
            }
        };
        Arrays.stream(new String[]{"1", "@", "34"}).forEach(consumer);
        Arrays.stream(new String[]{"1", "@", "34"}).filter((x)-> x.length() == 2).forEach(System.out::println);

        //-------------PREDICATE INTERFACE-------------------
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(predicate.test(5));

        Arrays.stream(new String[]{"1", "@", "34"}).filter((x)-> x.length() == 2).forEach(System.out::println);

        //-------------FUNCTION INTERFACE----------------

        Function<String ,String > function = (x)-> x + x;

        Arrays.stream(new String[]{"1", "@", "34"}).map(function).forEach(consumer);




    }


}