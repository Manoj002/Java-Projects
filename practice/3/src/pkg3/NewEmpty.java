package pkg3;

import javax.swing.JOptionPane;

class C2 {
    
    static void inp() {
        String name = JOptionPane.showInputDialog(null, "Enter your name");
        String title = JOptionPane.showInputDialog(null, "Enter your title");
        JOptionPane.showMessageDialog(null, "Welcome to JAVA " + title + name);
    }
}