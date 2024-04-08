package az.edu.turing.module00.lessonSwitch;

public class SwitchCase {
    public static void main(String[] args) {

        int x = 6;
        switch (x){
            case 8:
                System.out.println("hello");
                break;


            case 5,6:
                System.out.println("Halllo");

            case 7:
                System.out.println("Halo");
                break;
            default:
                System.out.println("heloo");
        }


        switch (x){
            case 8:
                System.out.println("hello");


            case 5:
                System.out.println("Halllo");

            case 7:
                System.out.println("Halo");
            default:
                System.out.println("heloo");
        }


        //switch expression
        String helloType = switch (x){
            case 8 -> "Halloo";
            case 6 ->"hello";
            default -> "no greeting";

        };

        System.out.println(helloType);

    }
}
