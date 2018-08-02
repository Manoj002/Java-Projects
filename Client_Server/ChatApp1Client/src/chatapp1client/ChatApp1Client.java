package chatapp1client;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatApp1Client {

    public static PrintWriter pw;
    public static BufferedReader br;
    public static int c;

    public static void main(String[] args) {
        try {
            Socket soc = new Socket("127.0.0.1", 9081);
            System.out.println("Connection established " + soc);
            br = new BufferedReader(
                    new InputStreamReader(
                            soc.getInputStream()
                    )
            );
            pw = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    soc.getOutputStream()
                            )
                    ), true
            );
            Login lgn = new Login();
            boolean flag = true;
            while (flag) {
                c = 0;
                for (int i = 0; i < 3; i++) {
                    if (c >= 3) {
                        System.exit(0);
                        break;
                    } else if (lgn.login() == 1) {
                        flag = false;
                        break;
                    } else {
                        c++;
                    }
                }
                if(c >= 3) {
                    System.exit(0);
                }
            }
            JFrame f = new JFrame("Client");
            JTextArea ta = new JTextArea();
            ta.setEditable(false);
            JTextField tf = new JTextField(10);
            JButton b = new JButton("Send");
            JPanel p = new JPanel();
            f.add(ta, BorderLayout.CENTER);
            p.add(tf);
            p.add(b);
            f.add(p, BorderLayout.SOUTH);
            f.setSize(400, 400);
            f.setLocation(0, 0);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Listen l1 = new Listen(tf, pw, ta);
            b.addActionListener(l1);
            tf.addActionListener(l1);
            String str = br.readLine();
            while (!str.equalsIgnoreCase("end")) {
                ta.append("Server : " + str + "\n");
                str = br.readLine();
            }
            ta.append("end\n");
            System.out.println("Client Signing OFF");
            System.exit(0);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
