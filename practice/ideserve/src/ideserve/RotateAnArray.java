package ideserve;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int k = sc.nextInt();
        Rotate(k, arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void Rotate(int k, int arr[]) {
        if(arr == null || arr.length  < 2) {
            return;
        }
        if(k < 0) {
            throw new IllegalArgumentException("k cannot be negative");
        } 
        if(k > arr.length) { 
            k = k%arr.length;
        }
        reverse(0, k-1, arr);
        reverse(k, arr.length-1, arr);
        reverse(0, arr.length-1, arr);
    }
    
    public static void reverse(int s, int e, int arr[]) {
        while(s < e) {
            int tmp = arr[e];
            arr[e] = arr[s];
            arr[s] = tmp;
            s++;
            e--;
        }
    }
}
