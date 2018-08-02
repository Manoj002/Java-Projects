package lambda;           // Constructor injection and method injection

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L1 implements ActionListener {
    
    static JTextField tf;
    static JTextArea ta;
    
    public static void m1(JTextField tf, JTextArea ta) {
        L1.tf = tf;
        L1.ta = ta;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = tf.getText();
        ta.append(str + "\n");
        tf.setText("");
    }
}