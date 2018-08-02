package queue;

public class Queue {

    public static void main(String[] args) {
        System.out.println("Welcome to Queue!");
        Op op = new Op();
        op.enqueue(10);
        op.enqueue(20);
        op.enqueue(30);
        op.enqueue(80);
        op.enqueue(100);
        op.enqueue(90);
        op.enqueue(50);
        op.enqueue(450);
        op.dequeue();
        op.dequeue();
        op.dequeue();
        op.print();
    }
    
}
