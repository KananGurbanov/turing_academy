package az.edu.turing.module00.lesson3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp {
    public static void main1(String[] args) {


//        try{
//            int result = 1/0;
//
//
//
//            System.out.println(result);
//        }
//
//        catch (Exception e){
//            System.out.println("Xeta bash verdi");
//            e.printStackTrace();
//        }
//
//        System.out.println(3545);



        //newOne


        try{


            String kenan = "kenan";

            System.out.println(kenan.charAt(10));

            int result2 = 1/0;
        }

        catch(ArithmeticException e){
            System.out.println("0 a bolmek olmaz");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        catch(StringIndexOutOfBoundsException e){
            System.out.println("String bound kecildi");
            System.out.println(e.getMessage());
            e.printStackTrace();

            //e.printStackTrace();
        }






    }

    public static void main(String[] args) {
        File file = new File("src/main/java/az/edu/turing/module01/part2/lesson1/resource");

        try{
            FileWriter fw = new FileWriter(file);
            fw.write(14);
        }catch (IOException e){
            System.out.println("Duzgun yaz");

            System.out.println(e.getMessage());

            e.printStackTrace();
        }


    }
}
