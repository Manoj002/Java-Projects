package serialserver;

import java.io.IOException;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


public class SerialServer {

    public static void main(String[] args) throws IOException {
        JFrame f1 = new JFrame("Serial Server");
        JTextArea ta = new JTextArea();
        f1.add(ta, BorderLayout.CENTER);
        ta.setEditable(false);
        f1.setSize(200, 200);
        f1.setLocation(200, 400);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Server signing ONN");
        ServerSocket soc = new ServerSocket(9081);
        for(int i = 0; i < 5; i++) {
            
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
            ta.append(str + "\n");
            pw.println(str);
            str = br.readLine();
        }
        pw.println("end");
        }
        System.out.println("Server Signing OFF");
        System.exit(0);
    }
    
}