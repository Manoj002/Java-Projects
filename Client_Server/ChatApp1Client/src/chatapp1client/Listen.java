package chatapp1client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Listen implements ActionListener{
    
    public static JTextField tf;
    public static PrintWriter pw;
    public static JTextArea ta;
    
    public Listen(JTextField tf, PrintWriter pw, JTextArea ta) {
        this.tf = tf;
        this.pw = pw;
        this.ta = ta;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = tf.getText();
        tf.setText("");
        ta.append("You : " 
                + str 
                + "\n "
        );
        pw.println(str);
    }
}