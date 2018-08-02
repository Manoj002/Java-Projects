package loginhashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LoginHashMap {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                            System.in
                                    )
        );
        HashMap<String, String> hm = new HashMap<>();
        hm.put("maddy", "maddy123");
        hm.put("manny", "manny123");
        hm.put("andy", "andy123");
        System.out.println("Enter username");
        String str = br.readLine();
        String str1 = hm.get(str);
        System.out.println("Enter password");
        str = br.readLine();
        System.out.println(str1);
        if(str1.equals(str)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login unsuccessfull");
        }
    }
    
}
