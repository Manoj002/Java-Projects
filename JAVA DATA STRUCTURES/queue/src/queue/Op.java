package queue;

public class Op {
    
    static int [] a = new int[10];
    static int sp = 0;
    
    public void enqueue(int v) {
        if(sp == 10) {
            System.out.println("Queue Overflow");
        } else {
            a[sp] = v;
            System.out.println("Element enqueued is " + v + " at " + sp);
            sp = sp + 1;
        }
    }
    
    public void dequeue() {
        int temp = 0;
        if(sp == 0) {
            System.out.println("Queue underflow");
        } else {
            System.out.println("Dequeue element is " + a[0]);
            for(int i = 0; i < sp; i++) {
                a[i] = a[i + 1];
            }
            sp = sp - 1;
        }
    }
    
    public void print() {
        if(sp == 0 || sp == 10) {
            System.out.println("Queue is either empty or full");
        } else {
            System.out.println("Printing queue");
            for(int i = 0; i <= sp-1; i++) {
                System.out.println(a[i]);
            }
        }
    }
}