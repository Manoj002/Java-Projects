package pkg5;

import javax.swing.JOptionPane;

import static p2.C2.*;

public class Main {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter 1st value");
        int x = Integer.parseInt(s);
        s = JOptionPane.showInputDialog(null, "Enter 2nd value");
        int y = Integer.parseInt(s);
        int sum = x + y;
        JOptionPane.showMessageDialog(null, "Addition = " + sum);
        add();
        inp();
        f_each();
    }
    
    static void add() {
        String str_1 = JOptionPane.showInputDialog(null, "Enter 1st number");
        String str_2 = JOptionPane.showInputDialog(null, "Enter 2nd number");
        int num_1 = Integer.parseInt(str_1);
        int num_2 = Integer.parseInt(str_2);
        int sum = num_1 + num_2;
        JOptionPane.showMessageDialog(null, "Addition = " + sum);
    }
    
    static void inp() {
        int [] a = new int[5];
        for(int i = 0; i < a.length; i++) {
            String s = JOptionPane.showInputDialog(null, "Enter array value" + i);
            int x = Integer.parseInt(s);
            a[i] = x;
        }
        for(int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
        arr_1();
    }
    
    static void arr_1() {
        String s = JOptionPane.showInputDialog(null, "Enter elements in array");
        int w = Integer.parseInt(s);
        String t;
        int [] b = new int[w];
        for(int k = 0; k < w; k++) {
            t = JOptionPane.showInputDialog(null, "Enter array value " + k);
            b[k] = Integer.parseInt(t);
        }
        for(int l = 0; l < w; l++) {
            JOptionPane.showMessageDialog(null, "Array values" + b[l]);
        }
    }
}
