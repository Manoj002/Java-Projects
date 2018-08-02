package queueofmsgs;

import java.util.ArrayList;

public class QueueOfMsgs {

    public static void main(String[] args) {
        Queue q = new Queue();
        Message m1 = new Message("s1", "d1", "Msg1");
        Message m2 = new Message("s2", "d2", "Msg2");
        Message m3 = new Message("s3", "d3", "Msg3");
        q.enqueue(m1);
        q.enqueue(m2);
        q.enqueue(m3);
        q.print();
        Message a = q.dequeue();
        System.out.println(a);
        q.print();
    }
    
}

class Queue {
    
    ArrayList<Message> al = new ArrayList<>();
    
    public void enqueue(Message v) {
        al.add(v);
    }
    
    Message dequeue() {
        if(al.isEmpty()) {
            return null;
        } else {
            return al.remove(0);
        }
    }
    
    public void print() {
        System.out.println("Printing queue");
        for(Message m : al) {
            System.out.println(m);
        }
    }
}

class Message {
    
    String source;
    String destination;
    String msg;
    
    public Message(String source, String destination, String msg) {
        this.source = source;
        this.destination = destination;
        this.msg = msg;
    }
    
    @Override
    public String toString(){
        return "Message : " 
                + "Source = " 
                + source 
                + ", destination = " 
                + destination 
                + ", Message = " 
                + msg;
    }
}