package linkedlist;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayWithNumbers {

    public static void main(String[] args) {
        Scan sn = new Scan();
        System.out.println("Enter number of elements in array");
        int n = sn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sn.nextInt();
        }

    }
}

class Scan {

    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer;
    private int bytesRead;

    public Scan() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = 0;
        bytesRead = 0;
    }

    public int nextInt() {
        int ret = 0;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = read();
        }
        do {
            ret = ret * 10 + c - '0';
        } while((c = read()) >= '0' && c <= '9');
    if(neg) {
        return -ret;
    }
    return ret;
    }
    
    private byte read() {
        if(bufferPointer == bytesRead) {
            try {
                fillBuffer();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return buffer[bufferPointer++];
    }
    
    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if(bytesRead == 1) {
            buffer[0] = -1;
        }
    }
}
