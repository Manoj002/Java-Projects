package ideserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciUsingDP {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n + 1];
        long res = fib(n - 1, arr);
        System.out.println(res);
        //System.out.println(fib(n));    //BOTTOM-UP APPROACH 
    }

    public static long fib(int n, int arr[]) {
        if (arr[n] != 0) {
            return arr[n];
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return fib(n - 1, arr) + fib(n - 2, arr);
    }

    /*public static long fib(int n) {   //BOTTOM-UP APPROACH
        if (n == 1 || n == 2) {
            return n;
        }
        long btm_up[] = new long[n + 1];
        btm_up[0] = 1;
        btm_up[1] = 1;
        for (int i = 2; i < btm_up.length; i++) {
            btm_up[i] = btm_up[i - 1] + btm_up[i - 2];
        }
        return btm_up[n - 1];
    }*/
}
