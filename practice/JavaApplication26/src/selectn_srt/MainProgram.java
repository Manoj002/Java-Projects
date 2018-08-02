package selectn_srt;

import javax.swing.*;

public class MainProgram {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,"Enter number of elements in array");
        int [] a = new int [Integer.parseInt(s)];
        for(int i = 0; i < a.length; i++) { 
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter " + i + "element"));
    }
            System.out.println("User inputs");
            for(int v : a) {
                JOptionPane.showMessageDialog(null, v);
        } 
            int max;
            int index;
            for(int i = a.length; i > 1; i--) { 
                max = a[0];
                index = 0;
                for(int j = 0; j < i; j++) {
                    if(max < a[j]) {
                        max = a[j];
                        index = j;
                    }
                }
                a[index] = a[i-1];
                a[i-1] = max;
            }
            JOptionPane.showMessageDialog(null, "Sorted Arrays" );
            for(int v : a) {
                JOptionPane.showMessageDialog(null, v);
            }
    } 
}