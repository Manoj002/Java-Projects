package reusability;

class C1 {
    int a;
    int b;
}

class C2 extends C1 {
    int c;
    int d;
}

public class MainProgram {

    public static void main(String[] args) {
        C1 obj1 = new C1();
        obj1.a = 1;
        obj1.b = 2;
        printc1(obj1);
        C2 obj2 = new C2();
        obj2.a = 10;
        obj2.b = 20;
        obj2.c = 30;
        obj2.d = 40;
        printc2(obj2);
    }
    
    static void printc1(C1 a) {
        System.out.println(a.a);
        System.out.println(a.b);
    }
    
    static void printc2(C2 b) {
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);
    }
}