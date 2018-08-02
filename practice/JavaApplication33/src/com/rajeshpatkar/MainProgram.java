package com.rajeshpatkar;

abstract class C1 {
    
    private int a;
    private int b;
    
    C1 (int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    abstract void sing();

    
    void print() {
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
    }
}

class C2 extends C1 {
    
    private int c;
    private int d;
    
    C2 (int a, int b, int c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }
    
    @Override
    void print() {
        super.print();
        System.out.println("c = " + this.c);
        System.out.println("d = " + this.d);
    }
    
    @Override
    void sing()
    {
        System.out.println("\nthey are alive alive alive.......");
    }

}

class C3 extends C1 {
    private int e;
    private int f;
    
    C3 (int a, int b, int e, int f) {
        super(a, b);
        this.e = e;
        this.f = f;
    }
    
    @Override
    void print() {
        super.print();
        System.out.println("e = " + this.e);
        System.out.println("f = " + this.f);
    }
    
    @Override
    void sing()
    {
        System.out.println("... are aliveeeee.....");
    }

}

class C4 extends C1 {
    private int i;
    private int j;
    
    C4(int a, int b, int i, int j) {
        super(a, b);
        this.i = i;
        this.j = j;
    }
    
    @Override
    void print() {
        super.print();
        System.out.println("i = " + this.i);
        System.out.println("j = " + this.j);
    }
    
    @Override
    void sing() {
        System.out.println("The hills are alive...");
    }
}

class MainProgram {
    
    public static void main(String[] args) {
        C2 obj2 = new C2(10, 20, 30, 40);
        obj2.print();
        C3 obj3 = new C3(11, 22, 33, 44);
        obj3.print();
        C4 obj4 = new C4(100, 200, 300, 400);
        obj4.print();
        stage(obj2);
        stage(obj3);
        stage(obj4);
    }
    
    static void stage(C1 obj) {
        obj.sing();
    }
    
    
}