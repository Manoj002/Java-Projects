package exercise4;

import javax.swing.*;
import java.awt.*;

class MainProgram {
    
    static JTextField tf;
    static JTextArea ta;
    
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Conversion");
        ta = new JTextArea();
        tf = new JTextField(10);
        JButton b1 = new JButton("Send");
        JPanel p1 = new JPanel();
        p1.add(tf);
        p1.add(b1);
        f1.add(ta);
        f1.add(p1, BorderLayout.SOUTH);
        f1.setSize(400, 450);
        f1.setLocation(300, 250);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        L1 l1 = new L1();
        b1.addActionListener(l1);
    }
}