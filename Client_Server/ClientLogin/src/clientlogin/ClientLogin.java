package clientlogin;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientLogin {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",9081);
            BufferedReader nis = new BufferedReader(
                                        new InputStreamReader(
                                                s.getInputStream()
                                        )
            );
            PrintWriter nos = new PrintWriter(
                                    new BufferedWriter(
                                            new OutputStreamWriter(
                                                    s.getOutputStream()
                                            )
                                    ), true
            );
            String un = JOptionPane.showInputDialog("Enter your Username");
            nos.println(un);
            JFrame f1 = new JFrame(un + "'s Chat GUI");
            JTextArea ta = new JTextArea();
            ta.setEditable(false);
            JTextField tf = new JTextField(10);
            JButton b1 = new JButton("Send");
            JPanel p1 = new JPanel();
            p1.add(tf);
            p1.add(b1);
            f1.add(ta, BorderLayout.CENTER);
            f1.add(p1, BorderLayout.SOUTH);
            f1.setSize(200, 200);
            f1.setLocation(100, 200);
            f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            L l1 = new L(tf, nos);
            b1.addActionListener(l1);
            tf.addActionListener(l1);
            
            String str = nis.readLine();
            while(!str.equalsIgnoreCase("end")) {
                ta.append(str + "\n");
                str = nis.readLine();
            }
            ta.append("Client signed off...");
            System.exit(0);
        } catch (Exception ex) {
            
        }
    }
    
}

class L implements ActionListener {
    
    static JTextField tf;
    static PrintWriter nos;
    
    L (JTextField tf, PrintWriter nos) {
        this.tf = tf;
        this.nos = nos;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = tf.getText();
        tf.setText("");
        nos.println(str);
    }
}