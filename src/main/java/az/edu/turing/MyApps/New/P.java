package az.edu.turing.MyApps.New;

import java.util.ArrayList;

public class P {
    public static void main(String[] args) {

        f(new ArrayList<Integer>() {{add(1);add(2);add(3);}});




    }

    static void f(ArrayList<Integer> f){
        f.add(5);
        System.out.println(f);
    }
}

