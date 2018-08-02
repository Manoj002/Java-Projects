package linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RoyAndProfilePicture {
    
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side of square");
        int l = Integer.parseInt(br.readLine()); 
        System.out.println("Enter number of photos");
        int n = Integer.parseInt(br.readLine());
        System.out.println(System.in.available());
        for(int i = 0; i < n; i++) {
            System.out.println("Enter width and height of image");
            System.out.println(System.in.available());
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w < l || h < l) {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(w == l || h == l) {
                System.out.println("ACCEPTED");
            } else {
                System.out.println("CROP IT");
            }
        }
    }
}
