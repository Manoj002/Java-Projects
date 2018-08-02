package server_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server_2 {

    public static MessageQueue<String> q = new MessageQueue<>();
    public static ArrayList<PrintWriter> noslist = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Server Signing ON");
        ServerSocket ss = new ServerSocket(8096);
        MessageDispatcher md = new MessageDispatcher();
        md.setDaemon(true);
        md.start();
        for (int i = 0; i < 10; i++) {
            Socket soc = ss.accept();
            System.out.println("Connection established");
            Conversation c = new Conversation(soc);
            c.start();
        }
        System.out.println("Server Signing OFF");
    }

}

class MessageQueue<T> {

    ArrayList<T> al = new ArrayList<>();

    synchronized public void enqueue(T i) {
        al.add(i);
        notify();
    }

    synchronized public T dequeue() {
        if (al.isEmpty()) {
            try {
                wait();
            } catch (Exception ex) {
            }
        }
        return al.remove(0);
    }

    synchronized public void print() {
        for (T i : al) {
            System.out.println("-->" + i);
        }

    }

    @Override
    synchronized public String toString() {
        String str = null;
        for (T s : al) {
            str += "::" + s;
        }
        return str;
    }
}

class MessageDispatcher extends Thread {
    
    @Override
    public void run() {
        while (true) {
            try {
                String str = Server_2.q.dequeue();
                for (PrintWriter o : Server_2.noslist) {
                    o.println(str);
                }
            } catch (Exception e) {
            }
        }
    }
}

class Conversation extends Thread {

    Socket soc;

    Conversation(Socket soc) {
        this.soc = soc;
    }

    @Override
    public void run() {
        try {
            BufferedReader nis = new BufferedReader(
                    new InputStreamReader(
                            soc.getInputStream()
                    )
            );
            PrintWriter nos = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    soc.getOutputStream()
                            )
                    ), true
            );
            Server_2.noslist.add(nos);
            String str = nis.readLine();
            while (!str.equals("End")) {
                Server_2.q.enqueue(str);
                System.out.println("Server Received " + str);
                str = nis.readLine();
            }
            nos.println("End");
            Server_2.noslist.remove(nos);
            System.out.println(
                    "Connection with "
                    + soc.getInetAddress().getHostAddress()
                    + " Terminated");
        } catch (Exception e) {
        }
    }
}
