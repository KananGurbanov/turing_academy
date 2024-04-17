package az.edu.turing.module01.part2.lesson6.SortSearch;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        // BUBBLE SORT - O(N^2) - OMEGA(N)
        // SELECTION SORT - O(N^2) - OMEGA(N^2)
        // MERGE SORT - O(N*LOGN) - OMEGA(N*LOGN)
        // INSERTION SORT - O(N^2) - OMEGA(N)
        int [] arr = new int[] {3,60,35,2,45,320,5};

        //bubbleSort(arr);

        //selectionSort(arr);

        mergeSort(arr);

        printArray(arr);
    }

    static void bubbleSort(int [] arr){
        int n = arr.length;



        for (int i = 0; i < n; i++){
            boolean sorted = true;
            for (int j = 0; j < n - i - 1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted){
                return;
            }
        }
    }

    static void selectionSort(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void mergeSort(int [] arr){
        int n = arr.length;

        if(n<=1) return;

        int middle = n / 2;

        int [] leftArray = new int[middle];

        int [] rightArray = new int[n - middle];

        for (int i = 0; i < n; i++){
            if(i < middle){
                leftArray[i] = arr[i];
            }
            else{
                rightArray[i - middle] = arr[i];

            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, arr);
    }

    static void merge(int [] leftArray, int [] rightArray, int [] arr){

    }


    static void mergev1(int [] leftArray, int [] rightArray, int [] array){

        int leftSize = array.length / 2;

        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;

            }
        }

        while (l<leftSize){
            array[i] = leftArray[l];
            i++;
            l++;

        }

        while(r<rightSize){
            array[i] = rightArray[r];
            i++;
            r++;

        }


    }

    static void printArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
