package com.rajeshpatkar;

public class Stk2 implements Stk, I1 {    // Service Provider(Server)

    private Node head;

    @Override
    public void push(int v) {

        head = new Node(v, head);

        //Optimization: head = (head == null)? new Node(v): new Node(v, head);
        // More optimization: head = new Node(v, head);
    }

    @Override
    public int pop() {

        Node temp = head;        // if(head != null) {
        head = head.getNext();   // int v = head.getV();
        return temp.getV();      // head = head.getNext();
    }                            // return v;
                                 // }

    @Override
    public void print() {
        System.out.println("Printing stack");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getV());
            temp = temp.getNext();
        }
    }
    
    @Override
    public void m1() {
        System.out.println("Entered m1");
        System.out.println("Leaving m1");
    }
    
    @Override
    public void m2() {
        System.out.println("Entered m2");
        System.out.println("Leaving m2");
    }

}
