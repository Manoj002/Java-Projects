package partyapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PartyApp {
    
    public static void main(String[] args) {
        try {
            int u,t,r;
            BufferedReader br = new BufferedReader(
                                        new InputStreamReader(
                                                System.in
                                            )
                                );
            System.out.println("Enter a String");
            String str = br.readLine();
            int l = str.length();
            System.out.println("Length of String = " + l);
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                System.out.println(c);
                Integer count = hm.get(c);
                System.out.println(count);
                if(count == null) {
                    hm.put(c, 1);
                } else {
                    hm.put(c, count + 1);
                }
            }
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
}