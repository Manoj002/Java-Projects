package serialclient;

import java.io.IOException;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.net.Socket;

public class SerialClient {

    public static void main(String[] args) throws IOException {
        JFrame f1 = new JFrame("Serial Client");
        JButton b1 = new JButton("Send");
        JTextArea ta = new JTextArea();
        JTextField tf = new JTextField(15);
        JPanel p = new JPanel();
        p.add(tf);
        p.add(b1);
        f1.add(ta, BorderLayout.CENTER);
        f1.add(p, BorderLayout.SOUTH);
        ta.setEditable(false);
        f1.setSize(300, 300);
        f1.setLocation(200, 200);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Client signing ONN");
        Socket s = new Socket("127.0.0.1", 9081);
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
        
        L1 l1 = new L1(tf, ta, pw);
        b1.addActionListener(l1);
        tf.addActionListener(l1);
        
        String str = br.readLine();
        while(!str.equals("end")) {
            ta.append(str + "\n");
            str = br.readLine();
        }
        
        ta.append("end");
        System.out.println("Client signing OFF");
        System.exit(0);
    }
    
}
