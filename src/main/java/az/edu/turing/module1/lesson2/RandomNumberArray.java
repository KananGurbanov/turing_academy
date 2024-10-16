package az.edu.turing.module1.lesson2;

import java.util.Random;
public class RandomNumberArray {
    public static void main(String[] args) {
        Random r = new Random();

        int [] arr = new int[10];


        for (int i = 0;i<10;i++){
            arr[i] = r.nextInt()%100;
        }
        for (int i=0;i<9;i++){
            for(int j = 0; j<9-i;j++){
                if (arr[j]>arr[j+1]){ //to make is descending "<" should be put
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
            }
        }

        for(int i : arr){
            System.out.println(i);
        }


    }
}
