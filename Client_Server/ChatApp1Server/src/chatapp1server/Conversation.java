package chatapp1server;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Conversation extends Thread {

    HashMap<String, String> hm = new HashMap<>();
    ArrayList<PrintWriter> al = new ArrayList();
    public static Socket clientSocket;
    public static JTextArea ta;

    public Conversation(Socket clientSocket) {
        this.clientSocket = clientSocket;
        hm.put("maddy", "maddy123");
        hm.put("mandee", "mandee123");
        hm.put("manoj", "manoj123");
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()
                    )
            );
            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    clientSocket.getOutputStream()
                            )
                    ), true
            );
            PrintWriter ptw = new PrintWriter(
                    new FileWriter(
                            "D:/output.txt"
                    ), true
            );
            al.add(pw);
            String userName = br.readLine();
            login(userName, br, pw);
            displayGui(pw);
            for (PrintWriter nos : al) {
                nos.println(userName + " online\n");
            }
            String str = br.readLine();
            while (!str.equalsIgnoreCase("end")) {
                ta.append(userName
                        + " : "
                        + str
                        + "\n"
                );
                ptw.println(str
                        + new Date()
                        + clientSocket.getRemoteSocketAddress() 
                        + "\n"
                );
                for(PrintWriter nos : al) {
                    nos.println(str + "\n");
                }
                str = br.readLine();
            }
            al.remove(pw);
            for (PrintWriter nos : al) {
                nos.println(userName + " offlie\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void login(String userName, BufferedReader br, PrintWriter pw) {
        try {
            String passWord = br.readLine();
            String pwd = (String) hm.get(userName);
            boolean flag = true;
            while (flag) {
                int c = 0;
                for (int i = 0; i < 3; i++) {
                    pwd = (String) hm.get(userName);
                    if (c >= 3) {
                        clientSocket.close();
                        Thread.currentThread().stop();
                        break;
                    } else if (c < 3 && passWord.equals(pwd)) {
                        pw.println("1");
                        flag = false;
                        break;
                    } else {
                        c++;
                        pw.println("0");
                    }
                    userName = br.readLine();
                    passWord = br.readLine();
                }
                if (c >= 3) {
                    clientSocket.close();
                    Thread.currentThread().stop();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void displayGui(PrintWriter pw) {
        JFrame f = new JFrame("Server");
        ta = new JTextArea();
        ta.setEditable(false);
        JTextField tf = new JTextField(10);
        JButton b = new JButton("Send");
        JPanel p = new JPanel();
        p.add(tf);
        p.add(b);
        f.add(p, BorderLayout.SOUTH);
        f.add(ta, BorderLayout.CENTER);
        f.setSize(300, 300);
        f.setLocation(100, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Listen ltn = new Listen(tf, pw, ta);
        tf.addActionListener(ltn);
        b.addActionListener(ltn);
    }
}
