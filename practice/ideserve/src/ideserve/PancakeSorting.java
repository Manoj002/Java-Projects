package ideserve;

import java.util.Arrays;
import java.util.Scanner;

public class PancakeSorting {
    
    public static void main(String[] args) {
        System.out.println("ENter number of elements in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        pancakeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void pancakeSort(int arr[]) {
        int n = arr.length;
        for(int i = n-1; i >0; i--) {
            int maxIdx = getMaxValueIndex(arr, i);
            if(maxIdx != i) {
                if(maxIdx != 0) {
                    flip(arr, maxIdx);
                }
                flip(arr, i);
            }
        }
    }
    
    public static void flip(int arr[], int end) {
        int start = 0;
        while(start <= end) {
            swap(arr, start ,end);
            start++;
            end--;
        }
    }
    
    public static void swap(int arr[], int start, int end) {
        int tmp = arr[end];
        arr[end] = arr[start];
        arr[start] = tmp;
    }
    
    public static int getMaxValueIndex(int arr[], int end) {
        int max = 0;
        for(int i = 1; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
