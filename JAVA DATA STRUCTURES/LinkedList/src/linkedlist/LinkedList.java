package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {

    public static void main(String[] args) {
        Node nd = new Node();
        nd.insert(10);
        nd.insert(20);
        nd.insert(30);
        nd.remove(20);
        nd.count();
    }
}
