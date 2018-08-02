package com.rajeshpatkar;

public class Node {
    
    private int v;
    private Node next;
    
    Node(int v, Node next) {
        
        this.v = v;
        this.next = next;
    }
    
    int getV() {       //accessor method
        
        return v;
    }
    
    Node getNext() {    //accessor method
        
        return next;
    }
    
    void print() {
        System.out.println("v = " + v);
        System.out.println("next = " + next);
    }
}