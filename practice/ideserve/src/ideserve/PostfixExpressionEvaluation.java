package ideserve;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PostfixExpressionEvaluation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int l = sc.nextInt();
        String arr[] = new String [l];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        evalPostfixExpression(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int evalPostfixExpression(String arr[]) {
        if(arr.length == 1) {
            return Integer.parseInt(arr[0]);
        }
        Stack<Integer> stk = new Stack<>();
    }
}
