package ideserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ideserve {

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array");
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            System.in
                    )
            );
            String str = br.readLine();
            int l = Integer.parseInt(str);
            int[] arr = new int[l];
            System.out.println("Enter array elements");
            for (int i = 0; i < l; i++) {
                str = br.readLine();
                arr[i] = Integer.parseInt(str);
            }
            SelectionSortArray(arr);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static void SelectionSortArray(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIndex] < arr[j]) {
                    minIndex = j;
                }
            }
            if(i != minIndex && arr[i] != arr[minIndex]) {
                swap(arr, i, minIndex);
            }
        }
    }
    
    private static void swap(int []arr, int i,int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
