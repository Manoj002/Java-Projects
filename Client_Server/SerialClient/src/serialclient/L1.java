package serialclient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class L1 implements ActionListener {
    
    static JTextField tf;
    static JTextArea ta;
    static PrintWriter pw;
    
    L1(JTextField tf, JTextArea ta, PrintWriter pw) {
        this.tf = tf;
        this.ta = ta;
        this.pw = pw;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = tf.getText();
        pw.println(str);
        tf.setText("");
    }
}