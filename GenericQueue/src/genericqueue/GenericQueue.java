package genericqueue;

import java.util.ArrayList;

public class GenericQueue {

    public static void main(String[] args) {
        Queue<Message> q = new Queue<>();
        Message m1 = new Message("src1", "dest1", "hello1");
        Message m2 = new Message("src2", "dest2", "hello2");
        Message m3 = new Message("src3", "dest3", "hello3");
        q.enqueue(m1);
        q.enqueue(m2);
        q.enqueue(m3);
        System.out.println("Printing queue");
        q.print();
        Message o = q.dequeue();
        System.out.println(o);
        System.out.println("Priting queue");
        q.print();
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        int i = q1.dequeue();
        System.out.println("Dequeue = " + i);
        q1.print();
        Queue<String> q2 = new Queue<>();
        q2.enqueue("cat");
        q2.enqueue("dog");
        q2.enqueue("billa");
        String s = q2.dequeue();
        System.out.println(s);
        q2.print();
    }
    
}

class Queue<T> {

    ArrayList<T> al = new ArrayList<>();
    
    public void enqueue(T i) {
        al.add(i);
    }
    
    T dequeue() {
        if(al.isEmpty()) {
            return null;
        } else {
            return al.remove(0);
        }
    }
    
    public void print() {
        for(T a : al) {
            System.out.println(a);
        }
    }
}

class Message {
    String src;
    String dst;
    String msg;
    
    public Message(String src, String d, String m) {
        this.src = src;
        this.dst = d;
        this.msg = m;
    }
    
    public String toString() {
        return "Message :\n" 
                + "Source = " 
                + src 
                + "\nDestination = " 
                + dst 
                + "\nMessage = " 
                + msg;
    }
}