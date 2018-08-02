package ideserve;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    
    public static void main(String[] args) {
        System.out.println("Enter number of elements in array");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int arr[] = new int [l];
        System.out.println("Enter array elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void mergeSort(int arr[]) {
        mergeSort(arr, 0, arr.length-1);
    }
    
    public static void mergeSort(int arr[], int start, int end) {
        if(start < end) {
            int mid = (start + end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    
    public static void merge(int arr[], int start, int mid, int end) {
        System.out.println(mid - start + 1);
        int n1 = mid - start + 1;
        int n2 = end - mid;
        
        int temp1 [] = new int[n1];
        int temp2 [] = new int[n2];
        
        for(int i = 0; i < n1; i++) {
            temp1[i] = arr[start + i];
        }
        
        for(int i = 0; i < n2; i++) {
            temp2[i] = arr[mid + i + 1];
        }
        
        int i = 0;
        int j = 0;
        int k = start;
        while(i < n1 && j < n2) {
            if(temp1[i] <= temp2[j]) {
                arr[k] = temp1[i];
                i++;
            } else {
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            arr[k] = temp1[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }
}
