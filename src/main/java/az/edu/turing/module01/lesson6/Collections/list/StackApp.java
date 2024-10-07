package az.edu.turing.module01.lesson6.Collections.list;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(4);


        System.out.println(stack);

//        System.out.println(stack.pop());
//
//        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search(2)); //starting from the top








    }
}
