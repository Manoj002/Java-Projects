package ideserve;

import java.util.Scanner;

public class CheckBalancedParenthesisInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        System.out.println("String is " + check(str));
    }

    public static boolean check(String str) {
        int c = 0;
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                c++;
            }
            if (arr[i] == ')') {
                if(c == 0) {
                    return false;
                }
                c--;
            }
        }
        if(c != 0) {
            return false;
        }
        return true;
    }
}
