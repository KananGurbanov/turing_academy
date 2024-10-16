package az.edu.turing.module1.lesson6.SortSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortSearchApp {
    public static void main(String[] args) {


        int arr[] ={3,60,35,2,45,320,5};

        //BINARY SEARCH

//        Arrays.sort(arr);
//
//        int index = binarySearch(arr, 45);
//
//        System.out.println(index);

        //BUBBLE SORT

//        bubbleSort(arr);

        //SELECTION SORT

//        selectionSort(arr);


        //MERGE SORT

        mergeSort(arr);



        printArray(arr);

        //COLLECTIONS SORT

        ArrayList<Integer> ar = new ArrayList<>();

        Collections.sort(ar);
    }

    static void bubbleSort(int [] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            boolean sorted = true;
            for(int j = 1; j < (n - i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
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

        for (int i = 0; i < n - 1; i++)
        {

            for (int j = i + 1; j < n; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }

    static void mergeSort(int [] array){
        int length = array.length;

        if(length<=1) return;

        int middle = length / 2;

        int [] leftArray = new int[middle];

        int [] rightArray = new int [length - middle];

        int i = 0;

        int j = 0;

        for(;i<length;i++){
            if(i<middle){
                leftArray[i] = array[i];

            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray,rightArray,array);

    }

    static void merge(int [] leftArray, int [] rightArray, int [] array){
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

    static int binarySearch(int [] arr, int target){
        int r = arr.length - 1;
        int l = 0;
        while(l<r){
            int mid = (l +r) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] > target){
                r = mid;
            }
            else{
                l = mid;
            }
        }
        return -1;
    }

    static void printArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
