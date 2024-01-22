package az.edu.turing.lesson6;
import java.util.*;
public class GradeFounder {

    public static void  main(String[] args){
        double grade = new Scanner(System.in).nextDouble();

        if ( grade >=91 ){
            System.out.println("A");
        }
        else if(grade < 91 && grade >=81){
            System.out.println("B");
        }
        else if(grade <81 && grade >=71){
            System.out.println("C");
        }
        else if(grade <71 && grade >=61){
            System.out.println("D");
        }

        else if(grade <61 && grade >=51){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
    }


}
