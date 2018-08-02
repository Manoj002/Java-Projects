package lambda;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class Injection {

    public static void main(String[] args) {
        JFrame f1 = new JFrame("GUI Client");
        JButton b1 = new JButton("Send");
        JTextField tf = new JTextField(10);
        JTextArea ta = new JTextArea();
        ta.setEditable(false);
        JPanel p = new JPanel();
        f1.add(ta, BorderLayout.CENTER);
        p.add(tf);
        p.add(b1);
        f1.add(p, BorderLayout.SOUTH);
        f1.setSize(300, 300);
        f1.setLocation(200, 200);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        L1.m1(tf, ta);
        L1 l1 = new L1();
        b1.addActionListener(l1);
        tf.addActionListener(l1);
    }
    
}
