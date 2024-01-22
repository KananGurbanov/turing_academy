package az.edu.turing.lesson6;
import java.util.*;
public class GradeFounder {

    public static void  main(String[] args){
        double grade = new Scanner(System.in).nextDouble();

        if ( grade >=91 && grade <= 100 ){
            System.out.println("A");
        }
        else if(grade >=81){
            System.out.println("B");
        }
        else if(grade >=71){
            System.out.println("C");
        }
        else if(grade >=61){
            System.out.println("D");
        }

        else if( grade >=51){
            System.out.println("E");
        }
        else if (grade >=0 ){
            System.out.println("F");
        }
        else{
            System.out.println("Wrong Number");
        }
    }


}
