package anonymousclass;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

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
        
        ActionListener l1 = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = tf.getText();
                ta.append(str + "\n");
                tf.setText("");
            }
            
        };
        b1.addActionListener(l1);
        tf.addActionListener(l1);
    }
    
}
