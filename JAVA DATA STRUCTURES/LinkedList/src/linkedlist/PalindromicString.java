package linkedlist;

import java.util.Scanner;

public class PalindromicString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str1 = new StringBuilder(str).reverse().toString();
        /*if(str.equals(str1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }*/
        //System.out.println(palindromeCheck(str)?"YES":"NO"); //to check whether string is palindrome
        String str1 = rev(str);  //to reverse a string
        System.out.println(str1);
    }
    
    public static String rev(String str) {
        char arr[] = str.toCharArray();
        int begin = 0;
        int end = arr.length-1;
        char temp;
        while(end > begin) {
            temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
        return new String(arr);
    }
    
    public static boolean palindromeCheck(String str) {
        char arr[] = str.toCharArray();
        int begin = 0;
        int end = arr.length-1;
        while(end > begin) {
            if(arr[begin] != arr[end]) {
                return false;
            }
            ++begin;
            --end;
        }
        return true;
    }
}
