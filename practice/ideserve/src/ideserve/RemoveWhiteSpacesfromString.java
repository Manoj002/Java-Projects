package ideserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RemoveWhiteSpacesfromString {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a string:");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        String str = br.readLine();
        char arr[] = str.toCharArray();
        String str1 = removeWhiteSpaces(arr);
        System.out.println(str1);
        /*for(int i = 0; i < arr.length; i++) { // WoRKS FINE
            if(arr[i] == ' ') {
                arr[i] = arr[i+1];
            }
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("");*/
    }

    public static String removeWhiteSpaces(char arr[]) {

        int sp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                sp += 1;
            } else {
                arr[i - sp] = arr[i];
            }
        }
        arr = Arrays.copyOf(arr, arr.length-sp);
        return new String(arr);
    }
}
