package ideserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubStringWithNonRepeatingCharacters {

    public static void main(String[] args) throws IOException {
        int c = 0;
        System.out.println("Enter a string:");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        String str = br.readLine();
        String str1 = getLongestSubString(str);
        System.out.println(str1);
    }

    public static String getLongestSubString(String str) {
        if (str == null) {
            return null;
        }
        int n = str.length();
        if(n < 2) {
            return str;
        }
 
        // array to store last index of string characters seen in the string, initialized to -1
        int[] charIndexes = new int[256];
        for (int i = 0; i < 256; i++) {
            charIndexes[i] = -1;
        }
         
        // Set index of first character
        charIndexes[str.charAt(0)] = 0;
         
        int currLength = 1; // Length of current non repeating substring 
        int maxLength = 1;  // Length of longest substring with non repeating characters found
        int prevIdx = 0;    // previous index of current character
        int startIdx = 0;   // Starting index of longest substring with non repeating characters found
 
        for(int i = 1; i < n; i++) {
            prevIdx = charIndexes[str.charAt(i)];
            if(prevIdx == -1 || i - currLength > prevIdx) {
                currLength++;
            } else {
                if(currLength > maxLength) {
                    maxLength = currLength;
                    startIdx = i - maxLength;
                }
                currLength = i - prevIdx;
            }
            charIndexes[str.charAt(i)] = i;
        }
         
        // Check if longest substring with non repeating characters ends at end of the string
        if(currLength > maxLength) {
            maxLength = currLength;
            startIdx = n - maxLength;
        }
         
        return str.substring(startIdx, startIdx + maxLength);
    }
}
