package az.edu.turing.module01.part2.lesson9.LambdaExpressionsAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.function.Function;

public class LambdaExpressionApp {
    public static void main(String[] args) {
        MyInterface myInterface = ()-> System.out.println("Hello");

        myInterface.sayHello();





    }
}
