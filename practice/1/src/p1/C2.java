package p1;

import static p2.C3.*;

import static p2.p3.C4.*;

class C1 {
    
    public static int i;

    public static void main(String[] args) {
        System.out.println("Entering main");
        i++;
        j++;
        m4();
        m1();
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("Leaving main");
    }
    
    static void m1() {
        System.out.println("Entering m1");
        i++;
        j++;
        m7();
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("Leaving m1");
    }
}

public class C2 {
    
    private static int l;
    
    public static void m2() {
        System.out.println("Entering m2");
        C1.i++;
        j++;
        l++;
        m3();
        System.out.println("i = " + C1.i);
        System.out.println("j = " + j);
        System.out.println("l = " + l);
        System.out.println("Leaving m2");
    }
    
    static void m3() {
        System.out.println("Entering m3");
        C1.i++;
        j++;
        l++;
        System.out.println("i = " + C1.i);
        System.out.println("j = " + j);
        System.out.println("l = " + l);
        System.out.println("Leaving m3");
    }
}
