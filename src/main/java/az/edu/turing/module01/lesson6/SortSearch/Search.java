package az.edu.turing.module01.lesson6.SortSearch;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        //LINEAR SEARCH - 0(N) - OMEGA(1)
        //BINARY SEARCH - O(LOGN) - OMEGA(1)

        int [] arr = new int[] {3,60,35,2,45,320,5};

        Arrays.sort(arr);

        int index = binarySearch(arr, 45);

        System.out.println(index);

        printArray(arr);


    }

    static int binarySearch(int [] arr, int target){
        int r = arr.length;
        int l = 0;
        while(l < r){
            int middle = (l + r) / 2;
            if(arr[middle] == target){
                return middle;
            }

            else if(arr[middle] > target){
                r = middle;
            }
            else{
                l = middle;
            }
        }
        return -1;
    }

    static void printArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
