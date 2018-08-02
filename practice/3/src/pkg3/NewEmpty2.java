package pkg3;

import javax.swing.JOptionPane;

class C3 {
    
    static void add() {
        String num_1 = JOptionPane.showInputDialog(null, "Enter 1st number");
        String num_2 = JOptionPane.showInputDialog(null, "Enter 2nd number");
        
        int i = Integer.parseInt(num_1);
        int j = Integer.parseInt(num_2);
        
        int sum = i + j;
        JOptionPane.showMessageDialog(null, "Addition = " + sum);
    }
}