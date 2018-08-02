package p2;

import javax.swing.*;

public class C2 {
    
    public static void f_each() {
        String s = JOptionPane.showInputDialog(null, "Enter number of elements in array");
        int x = Integer.parseInt(s);
        int k;
        int [] a = new int[x];
        for(int i = 0; i < x; i++) {
            s = JOptionPane.showInputDialog(null, "Enter value of" + i + "array");
            k = Integer.parseInt(s);
            a[i] = k;
        }
        JOptionPane.showMessageDialog(null, "Array elements:");
        for(int v : a) {
            System.out.println("");
            JOptionPane.showMessageDialog(null, v);
        }
        int max = a[0];
        for(int j = 1; j < a.length; j++) {
            if(max < a[j]) {
                max = a[j];
            }
        }
        JOptionPane.showMessageDialog(null, "Highest element in array = " + max);
        h_str();
    }
    
    static void h_str() { 
        String s = JOptionPane.showInputDialog(null, "Enter number of elements in array");
        int x = Integer.parseInt(s);
        String [] t = new String [x];
        for(int i = 0; i < t.length; i++) {
            s = JOptionPane.showInputDialog(null, "Enter string " + i);
            t[i] = s;
        }
        for(String c : t) {
            JOptionPane.showMessageDialog(null, c);
        }
        String max = t[0];
        for(int j = 0; j < t.length; j++) {
            if(max.compareTo(t[j]) < 0) {
                max = t[j];
            }
        }
        JOptionPane.showMessageDialog(null, "Highest String = " + max);
    }
}