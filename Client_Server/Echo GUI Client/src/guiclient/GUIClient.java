package guiclient;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class GUIClient {
    
    static JTextField tf;
    static JTextArea ta;
    static PrintWriter pw;
    
    public static void main(String[] args) throws IOException {
        System.out.println("Client signing ONN");
        Socket s = new Socket("127.0.0.1", 9081);
        System.out.println("Connection established");
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(
                                    System.in
                                )
        );
        pw = new PrintWriter(
                 new BufferedWriter(
                     new OutputStreamWriter(
                         s.getOutputStream()
                    )
                ), true
        );
        JFrame f1 = new JFrame("GUI Client");
        JPanel p = new JPanel();
        JButton b1 = new JButton("Send");
        ta = new JTextArea();
        tf = new JTextField(10);
        p.add(tf);
        p.add(b1);
        f1.add(p, BorderLayout.SOUTH);
        f1.add(ta, BorderLayout.CENTER);
        f1.setSize(400, 500);
        f1.setLocation(200, 250);
        ta.setEditable(false);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        L1 l1 = new L1();
        b1.addActionListener(l1);
        tf.addActionListener(l1);
        BufferedReader nis = new BufferedReader(
                                    new InputStreamReader(
                                            s.getInputStream()
                                    )
        );
        String str = nis.readLine();
        while(!str.equals("end")) {
            ta.append(str + "\n");
            str = nis.readLine();
        }
        
        System.out.println("Client signing OFF");
        System.exit(0);
    }
}