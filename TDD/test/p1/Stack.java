package p1;

public class Stack {
    
    int c = 2;
    int [] a = new int[2];

    void push(int v) {
        c--;
        a[c] = v;
    }

    int peek() {
        return a[c];
    }

    int pop() {
        int z = a[c];
        c++;
        return z;
    }
    
}
