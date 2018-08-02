package com.rajeshpatkar;

public class LStack extends Stack{

    private Node head;
    
    public void push(int v) {
        head = new Node(v, head);
        pushCount++;
    }
    
    public int pop() {
        popCount++;
        if(head == null) {
            return -1;
        } else {
            int temp = head.getV();
            head = head.getNext();
            return temp;
        }
      
    }
    
    public void print() {
        int temp;
        System.out.println("Printing LStack");
        while(head != null) {
            temp = head.getV();
            System.out.println(temp);
            head = head.getNext();
        }
    }
    
}