package linkedlist;

import java.util.Arrays;
import java.util.Scanner;

public class Cipher {

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        System.out.println("Enter the cipher value:");
        int c = sc.nextInt();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
                if (arr[i] >= 48 && arr[i] <= 57) {
                    if (arr[i] + c <= 57) {
                        if(c < 9) {
                            System.out.print((char)(arr[i] + c));
                        } else {
                            
                        }
                        
                    } else {
                        System.out.print((char) (arr[i] - (10 - c)));
                    }
                }
                else if (arr[i] >= 65 && arr[i] <= 90) {
                    if (arr[i] + c <= 90) {
                        System.out.print((char) (arr[i] + c));
                    } else {
                        System.out.print((char) (arr[i] - (26 - c)));
                    }
                }
                else if (arr[i] >= 97 && arr[i] <= 122) {
                    if (arr[i] + c <= 122) {
                        System.out.print((char) (arr[i] + c));
                    } else {
                        System.out.print((char) (arr[i] - (26 - c)));
                    }
                }
                else {
                    System.out.print((char)(arr[i]));
                }
        }
    }
}
