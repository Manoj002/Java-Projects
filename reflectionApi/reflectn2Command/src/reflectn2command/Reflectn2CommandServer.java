package reflectn2command;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import reflectn2.DefaultAction;
import reflectn2.Reflectn2;

public class Reflectn2CommandServer {

    public static void main(String[] args) {
        System.out.println("Server Signing ONN...");
        try {
            ServerSocket soc = new ServerSocket(9081);
            Socket s = soc.accept();
            PrintWriter nos = new PrintWriter(
                                    new BufferedWriter(
                                            new OutputStreamWriter(
                                                    s.getOutputStream()
                                            )
                                    ), true
            );
            BufferedReader nis = new BufferedReader(
                                        new InputStreamReader(
                                                s.getInputStream()
                                        )
            );
            String str = nis.readLine();
            while(!str.equalsIgnoreCase("End")) {
                System.out.println("Server Received : " + str);
                try {
                    Class c = Class.forName("reflectnaction." +str);
                    Reflectn2 a = (Reflectn2)c.newInstance();
                    a.execute(nos);
                } catch(ClassNotFoundException ex) {
                    DefaultAction b = new DefaultAction();
                    b.execute(nos);
                }
                str = nis.readLine();
            }
            nos.println("End");
            System.out.println("Server Signing OFF...");
        } catch(Exception ex) {
            System.out.println("Exception");
        }
    }
    
}
