package client;

import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Client {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Client signing ONN");
        Socket s = new Socket("127.0.0.1", 9081);
        System.out.println("Connection established");
        BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        System.in
                                    )
        );
        PrintWriter pw = new PrintWriter(
                                new BufferedWriter(
                                    new OutputStreamWriter(
                                        s.getOutputStream()
                                    )
                                ), true
        );
        String str = br.readLine();
        while(!str.equals("End")) {
            pw.println(str);
            str = br.readLine();
        }
        pw.println("end");
        System.out.println("Client signing OFF");
    }
}