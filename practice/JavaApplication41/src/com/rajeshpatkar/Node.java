package com.rajeshpatkar;

public class Node {
    
    private int v;
    private Node next;

    Node (int v, Node next) {
        this.v = v;
        this.next = next;
    }
    
    public int getV() {
        return v;
    }
    
    public Node getNext() {
        return next;
    }
}