package exercise4;

import java.awt.event.*;

class L1 implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String str = MainProgram.tf.getText();
        MainProgram.ta.append(str + "\n");
        MainProgram.tf.setText("");
    }
}