package az.edu.turing.module1.lesson9.LambdaExpressionsAndFunctionalInterfaces;

public class LambdaExpressionApp {
    public static void main(String[] args) {
        MyInterface myInterface = ()-> System.out.println("Hello");
        myInterface.sayHello();
    }
}
