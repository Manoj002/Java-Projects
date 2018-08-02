package ideserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordsinaString {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a string");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        String str = br.readLine();
        char arr[] = str.toCharArray();
        getReverse(arr);
        System.out.println(arr);
    }

    public static void getReverse(char arr[]) {
        int n = arr.length;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' && i > 0) {
                reverse(arr, start, i - 1);
                start = i + 1;
            } else if (i == n - 1) {
                reverse(arr, start, i);
            }
        }
        reverse(arr, 0, n - 1);
    }

    public static void reverse(char arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(char arr[], int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
