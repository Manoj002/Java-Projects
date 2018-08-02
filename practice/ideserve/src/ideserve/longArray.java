package ideserve;

import java.util.Scanner;

public class longArray {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
