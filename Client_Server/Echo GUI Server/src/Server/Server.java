package server;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Server {
    
    public static void main(String[] args)throws IOException {
        JFrame f1 = new JFrame("GUI Server");
        JTextArea ta = new JTextArea();
        f1.add(ta, BorderLayout.CENTER);
        f1.setSize(200, 200);
        f1.setLocation(400, 400);
        ta.setEditable(false);
        f1.setVisible(true);
        System.out.println("Server signing ONN");
        ServerSocket soc = new ServerSocket(9081);
        Socket s = soc.accept();
        System.out.println("Connection established");
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(
                                    s.getInputStream()
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
        while(!str.equals("end")) {
            System.out.println(str);
            ta.append(str + "\n");
            pw.println(str);
            str = br.readLine();
        }
        pw.println("end");
        System.out.println("Server signing OFF");
        System.exit(0);
    }
}