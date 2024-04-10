package az.edu.turing.module01.part2.lesson6;

public class SortApp {
    public static void main(String[] args) {


        int arr[] ={3,60,35,2,45,320,5};

        //BUBBLE SORT

//        bubbleSort(arr);

        //SELECTION SORT

//        selectionSort(arr);

        //MERGE SORT

//        mergeSort(arr);



        printArray(arr);


    }

    static void bubbleSort(int [] arr){
        int n = arr.length;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    static void selectionSort(int [] arr){
        int n = arr.length;

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    static void mergeSort(int [] array){
        int length = array.length;

        if(length<=1) return;

        int middle = length / 2;

        int [] leftArray = new int[middle];

        int [] rightArray = new int [length - middle];

        int  i = 0;

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

    static void printArray(int [] arr){
        for (int i: arr){
            System.out.println(i);
        }
    }
}
