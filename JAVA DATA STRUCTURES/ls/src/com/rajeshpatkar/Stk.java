package com.rajeshpatkar;

class Stk {

    private Node head;

    void push(int v) {

        head = new Node(v, head);

        //Optimization: head = (head == null)? new Node(v): new Node(v, head);
        // More optimization: head = new Node(v, head);
    }

    int pop() {

        Node temp = head;        // if(head != null) {
        head = head.getNext();   // int v = head.getV();
        return temp.getV();      // head = head.getNext();
    }                            // return v;
                                 // }

    void print() {
        System.out.println("Printing stack");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getV());
            temp = temp.getNext();
        }
    }

}
