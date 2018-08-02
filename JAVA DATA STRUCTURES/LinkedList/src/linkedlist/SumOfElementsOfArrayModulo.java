package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfElementsOfArrayModulo {
    
    public static void main(String[] args) throws IOException {
        double mod = 1000000007;
        System.out.println("Enter number of elements in array");
        BufferedReader kin = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(kin.readLine());
        int arr[] = new int [l];
        System.out.println("Enter array elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(kin.readLine());
        }
        long res = 1;
        for(int i = 0; i <arr.length; i++) {
            res = (int) (res * arr[i] % mod);
        }
        System.out.println(res);
    }
}
