package linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrams {
    
    public static void main(String[] args) throws Exception{
        BufferedReader kin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases");
        int n = Integer.parseInt(kin.readLine());
        System.out.println("Enter string 1");
        String str = kin.readLine();
        System.out.println("Enter string 2");
        String str1 = kin.readLine();
        System.out.println(remAnagram(str, str1));
    }
    
    public static int remAnagram(String str, String str1) {
        int count1[] = new int[26];
        int count2[] = new int[26];
        for(int i = 0; i < str.length(); i++) {
            count1[str.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str1.length(); i++) {
            count2[str1.charAt(i) - 'a']++;
        }
        int result = 0;
        for(int i = 0; i < 26; i++) {
            result += Math.abs(count1[i]-count2[i]);
        }
        return result;
    }
}
