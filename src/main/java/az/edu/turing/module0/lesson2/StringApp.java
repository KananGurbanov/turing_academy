package az.edu.turing.module0.lesson2;

public class StringApp {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        a = 0;

        System.out.println(b);


    }

    public static void main2(String[] args) {
        int[] array = {3, 7, 5};

        int first = array[0];
        int second = array[0];

        for (int j : array) {

            if (j > first) {
                second = first;
                first = j;
            } else if (j > second && j != first) {
                second = j;
            }
        }

        System.out.println(first + " " + second);
    }
}
