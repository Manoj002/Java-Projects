package ideserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchElementinaBinaryTree {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            System.in
                    )
            );
            System.out.println("Enter number of elements in array");
            int l = Integer.parseInt(br.readLine());
            int arr[] = new int[l];
            System.out.println("Enter sorted Array:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Enter element to find:");
            int k = Integer.parseInt(br.readLine());
            int index = findElement(k, arr);
            System.out.println("Element " + k + " found at " + index);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static int findElement(int k, int arr[]) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
