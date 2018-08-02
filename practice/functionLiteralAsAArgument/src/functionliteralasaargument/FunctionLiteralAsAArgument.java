package functionliteralasaargument;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FunctionLiteralAsAArgument {

    public static void main(String[] args) {
        JFrame f1 = new JFrame("GUI Client");
        JButton b1 = new JButton("Send");
        JTextArea ta = new JTextArea();
        JTextField tf = new JTextField(10);
        JPanel p = new JPanel();
        p.add(tf);
        p.add(b1);
        f1.add(ta, BorderLayout.CENTER);
        f1.add(p, BorderLayout.SOUTH);
        f1.setSize(300, 300);
        f1.setLocation(200, 200);
        ta.setEditable(false);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1.addActionListener((e) -> {
           String str = tf.getText();
           ta.append(str + "\n");
           tf.setText("");
        });
        
        tf.addActionListener(b1.getActionListeners()[0]);// getActionListeners is a predefined method which gives array
    }
}
