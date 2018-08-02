package p2;

import static p1.C2.*;

import static p2.p3.C4.*;

public class C3 {
    
    public static int j;
    
    public static void m4() {
        System.out.println("Entering m4");
        j++;
        m5();
        System.out.println("j = " + j);
        System.out.println("Leaving m4");
    }
    
    static void m5() {
        System.out.println("Entering m5");
        j++;
        m2();
        m6();
        System.out.println("j = " + j);
        System.out.println("Leaving m5");
    }
}