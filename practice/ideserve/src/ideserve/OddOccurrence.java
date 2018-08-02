package ideserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrence {

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array");
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            System.in
                    )
            );
            int l = Integer.parseInt(br.readLine());
            int[] arr = new int[l];
            System.out.println("Enter array elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            NumberOccuringOddNumberOfTimes(arr);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    /*public static void NumberOccuringOddNumberOfTimes(int arr[]) {                  //2 for loops complexity: O(n^2)
        if(arr == null || arr.length == 0) {
            System.out.println("Empty Array");
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            int count = 1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j) {
                    count++;
                }
            }
            if(count % 2 == 1) {
                System.out.println("Number occuring odd times = " + arr[i]);
            }
        }
    }*/
   
    public static void NumberOccuringOddNumberOfTimes(int arr[]) {                 //Using HashMap, Complexity: O(n) for time and O(n) for space
        if (arr == null || arr.length == 0) {                                      //Incomplete
            System.out.println("Empty array");
            return;
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i] + 1));
            } else {
                hm.put(arr[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() % 2 == 1) {
                System.out.println("Number occuring odd number of times = "  + entry.getKey());
            }
        }
    }
    
    
    /*public static void NumberOccuringOddNumberOfTimes(int arr[]) {                //XOR Operator, Time Complexity = O(n) and space complexity = O(1)
        if(arr == null || arr.length == 0) {
            System.out.println("Empty Array");
            return;
        }
        
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println("Number occuring odd number of times = " + result);
    }*/
}
