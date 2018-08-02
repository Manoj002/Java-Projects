package ideserve;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Sorts {

    private static final float SHRINK_FACTOR = 1.3f;

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        combSort(arr); //for large size of array
        //selectionSort(arr);
        //insertionSort(arr);
        //bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void bubbleSort(int array[]) {
        if(array == null || array.length < 2) {
            return;
        }
        int n = array.length;
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int j = 1; j < n; j++) {
                if(array[j-1] > array[j]) {
                    swap(array, j-1, j);
                    swapped = true;
                }
            }
            n--;    // nth element placed at correct position, so next iteration needs to be done till n-1th element
        }
    }
    
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void selectionSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if(i != minIndex && arr[i] != arr[minIndex]) {
                swap(arr, i, minIndex);
            }
        }

    }

    public static void combSort(int array[]) {
 
        if(array == null || array.length < 2) {
            return;
        }
 
        int n = array.length;
        int gap = n;
        boolean swapped = false;
 
        do {
             
            gap = (int) (gap / SHRINK_FACTOR);
            for (int i = 0; i < n - gap; i++) {
                if (array[i] > array[i + gap]) {
                    swap(array, i, i + gap);
                    swapped = true;
                }
            }
             
        } while (gap > 1 && swapped);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
