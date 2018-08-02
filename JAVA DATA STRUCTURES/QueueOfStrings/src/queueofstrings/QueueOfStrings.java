package queueofstrings;

import java.util.ArrayList;

public class QueueOfStrings {

    public static void main(String[] args) {
        Queue q = new Queue();
        
        //Queue of Strings
        /*q.enqueue("cat");
        q.enqueue("dog");
        q.enqueue("billa");
        String str = q.dequeue();*/
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        int i = q.dequeue();
        System.out.println("dequeue = " +i);
        q.print();
    }

}

class Queue {
    
    ArrayList<Integer> al = new ArrayList<>();
    
    public void enqueue(Integer v) {
        al.add(v);
    }
    
    public int dequeue() {
        int i = al.remove(0);
        return i;
    }
    
    public void print() {
        System.out.println("Printing Queue");
        for(Integer i : al) {
            System.out.println(i);
        }
    }
}
// Queue of Strings
/*class Queue {
    
    public static ArrayList<String> al = new ArrayList<>();
    
    public void enqueue(String s) {
        al.add(s);
    }
    
    static String dequeue() {
        String s = al.remove(0);
        return s;
    }
    
    public void print() {
        for(String s : al) {
            System.out.println(s);
        }
    }
}
*/