package pkg3;

import javax.swing.JOptionPane;

class C4 {
    
    static void calc() {
        String str_1 = JOptionPane.showInputDialog(null, "Enter 1st number");
        String str_2 = JOptionPane.showInputDialog(null, "Enter 2nd number");
        String str_3 = JOptionPane.showInputDialog(null, "Enter 1 for addition\n"
                + "Enter 2 for subtraction\n"
                + "Enter 3 for division\n"
                + "Enter 4 for multiplication");
        
        int i = Integer.parseInt(str_1);
        int j = Integer.parseInt(str_2);
        int op = Integer.parseInt(str_3);
        
        int result = 0;
        
        switch (op) {
            case 1: result = i + j;
                    break;
            case 2: result = i - j;
                    break;
            case 3: result = i / j;
                    break;
            case 4: result = i * j;
                    break;
        }
        
        JOptionPane.showMessageDialog(null, "Result = " + result);
    }
}