package az.edu.turing.module1.lesson9;

import java.util.HashMap;
import java.util.Map;

public class RandomNumbersDuplicate {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1,2);
        //map.remove(1, 2);


//        for (int i = 0; i < 10; i++){
//            int random = new Random().nextInt(0,21);
//            int size;
//            if(map.get(random) == null){
//                size = 0;
//            }
//            else{
//                size = map.get(random);
//            }
//
//            map.put(random, ++size);
//
//        }
//
        System.out.println(map);


    }
}
