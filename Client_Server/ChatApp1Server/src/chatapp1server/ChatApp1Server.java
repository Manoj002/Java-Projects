package chatapp1server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatApp1Server {

    public static void main(String[] args) {
        try {
            ServerSocket soc = new ServerSocket(9081);
            for (int i = 0; i < 5; i++) {
                System.out.println("Waiting to accept new Conncetion.");
                Socket clientSocket = soc.accept();
                System.out.println("Connection established from " + clientSocket);
                Conversation c = new Conversation(clientSocket);
                c.start();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
