package client_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;

public class Client_2 {

    public static void main(String[] args) throws Exception {
        System.out.println("Client Signing on");
          try {
            Socket soc = new Socket("127.0.0.1", 8096);
            Reader r = new Reader(soc);
            r.start();
            System.out.println("Client says connection established");

            OutputStream out = soc.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out);
            BufferedWriter br = new BufferedWriter(osw);
            PrintWriter nos = new PrintWriter(br, true);
            BufferedReader kin = new BufferedReader(
                    new InputStreamReader(
                            System.in
                    )
            );
            String n = kin.readLine();
            while (!n.equals("End")) {
                nos.println(n);
                n = kin.readLine();
            }
            nos.println("End");

            System.out.println("Client Signing off");

        } catch (ConnectException e) {

        }
    }
}

class Reader extends Thread {

    Socket soc;

    Reader(Socket soc) {
        this.soc = soc;
    }

    public void run() {
        try {
            BufferedReader nis = new BufferedReader(
                            new InputStreamReader(
                            soc.getInputStream()
                            )
             );
            String str = nis.readLine();
            while( !str.equals("End") )
            {
             System.out.println("Message from Server >> " +str );
             str = nis.readLine();
            }
        } catch (Exception e) {
        }
    }
}