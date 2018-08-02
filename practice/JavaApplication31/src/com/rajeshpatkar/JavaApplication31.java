package com.rajeshpatkar;

import java.util.*;
import java.io.*;

class MainProgram {

    public static void main(String[] args) throws IOException {
        BufferedReader kin = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        PrintWriter fos = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("D:\\output.txt", true)
                ), true
        );
        BufferedReader fis = new BufferedReader(
                new FileReader(
                        "D:\\input.txt"
                )
        );
        ArrayList<String> a1 = new ArrayList<String>();
        String str = kin.readLine();
        while (!str.equals("end")) {
            a1.add(str);
            str = kin.readLine();
        }
        String str1 = fis.readLine();
        while(str1 != null) {
            a1.add(str1);
            str1 = fis.readLine();
        }
        for (String s : a1) {
            System.out.println(s);
            fos.println(s);
        }
    }
}