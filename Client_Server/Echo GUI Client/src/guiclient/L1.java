package guiclient;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class L1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = GUIClient.tf.getText();
        if (str.equals("end")) {
            GUIClient.pw.println(str);
            System.exit(0);
        } else {
            GUIClient.pw.println(str);
            GUIClient.tf.setText("");
        }
    }
}
