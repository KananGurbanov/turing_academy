package az.edu.turing.module01.lesson9;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();

        func(str);

    }

    public static void func(String str){
        if(str.equalsIgnoreCase("qebul")){
            System.out.println("Sifaris qebul olundu");
        }
        else if(str.equalsIgnoreCase("gelir")){
            System.out.println("Sifaris yoldadir");
        }
        else if (str.equalsIgnoreCase("catdirildi")){
            System.out.println("Sifaris catdirildi");
        } else if (str.equalsIgnoreCase("legv")) {
            System.out.println("Sifaris legv olundu");
        }

    }


}
