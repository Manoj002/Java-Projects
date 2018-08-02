package exceptiontrywithresources;

import java.io.*;

public class ExceptionTryWithResources {

    public static void main(String[] args) {
        m1();
        m2();
    }
    
    static void m1() {
        System.out.println("m1 opening connection to a file");
        PrintWriter pw = null;
        BufferedReader br = null;
        try {
            pw = new PrintWriter(
                        new BufferedWriter(
                                new FileWriter(
                                        "D:\\output.txt", true
                                )
                        ), true
            );
            br = new BufferedReader(
                        new FileReader(
                                "D:\\input.txt"
                        )
            );
            String str = br.readLine();
            while(str != null) {
                System.out.println(str);
                pw.println(str);
                str = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("IOException caught");
        } finally {
            pw.close();
        }
    }
    
    static void m2(){
        System.out.println("m2 Opening Connection to a File");
        BufferedReader br = null;
        try
        ( PrintWriter fos = new PrintWriter(
                              new BufferedWriter(
                               new FileWriter("D:\\output.txt",true)
                              ), true
                            )
        ) 
        {
            br = new BufferedReader(
                    new FileReader("D:\\input.txt")
            );
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                fos.println(str);
                str = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException Caught");
        } 

    }
}
