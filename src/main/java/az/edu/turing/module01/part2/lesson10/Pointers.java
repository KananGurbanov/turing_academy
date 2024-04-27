package az.edu.turing.module01.part2.lesson10;

public class Pointers {
    public static void main(String[] args) {
        String a = "kenan", b = "ferid";

        System.out.printf("a = %s, b = %s\n", a, b);

        swap(a,b);

        System.out.printf("a = %s, b = %s", a, b);

        final int k = 7;

        String m = "sdfs";

        m.concat("dsds");
        System.out.println(m);





    }

    public static void swap(String a, String b){
        String temp = a;
        a = b;
        b = temp;


    }
}
