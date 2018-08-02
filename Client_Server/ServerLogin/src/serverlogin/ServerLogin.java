package serverlogin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ServerLogin {

public static ArrayList<PrintWriter> al = new ArrayList<>();
    //static String LogFile = "D:\\Server\\Log.txt";
    //public static PrintWriter pwLog;
        // Logging code
    /*static{
        try {
            pwLog = new PrintWriter(
                        new BufferedWriter(
                            new FileWriter(LogFile,true)
                        ),true
            );
        } catch (Exception ex) {
            System.out.println("Some Problem with IO or File");
        }
    }*/
    public static void main(String[] args) throws Exception {
        System.out.println("Server signing On");
        //Executor e = Executors.newFixedThreadPool(2);// Server will handle only 2 threads 
        ExecutorService e = Executors.newFixedThreadPool(3);
        ScheduledExecutorService schedulor = Executors.newScheduledThreadPool(1);
        schedulor.scheduleAtFixedRate(
                                        () -> System.out.println("JAAGTE RAHO..."),
                                        5,
                                        1,
                                        TimeUnit.SECONDS
        );
        ServerSocket ss = new ServerSocket(9081);
        for (int i = 0; i < 5; i++) {
            Socket soc = ss.accept();
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
            al.add(nos);
            e.execute(() -> {
                System.out.println("Conversation Thread " 
                        + Thread.currentThread().getName() 
                        + " signing onn");
            });
            try {
                String str = nis.readLine();
                while (!str.equalsIgnoreCase("end")) {
                    System.out.println("Server received : " + str);
                    for(PrintWriter o : al) {
                        o.println(str);
                    }
                    str = nis.readLine();
                }
                nos.println("End");
            } catch (Exception ex) {
                System.out.println("Client seems to have abruptly close the connection");
            }
            System.out.println("Conversation Thread " 
                    + Thread.currentThread().getName() 
                    + " signing off...");
            //Conversation c = new Conversation(soc);
            //c.start();
        }
        e.shutdown();
        schedulor.shutdown();
        System.out.println("Server signing Off");
    }

}

/*class Conversation extends Thread {

    Socket soc;
    String Username;
    
    
    public Conversation(Socket soc) {
        this.soc = soc;
    }

    @Override
    public void run() {
        System.out.println("Conversation thread  "
                + Thread.currentThread().getName()
                + "   signing On");
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
            ServerLogin.al.add(nos);
            Username = nis.readLine();
            String message = nis.readLine();
            while (!message.equalsIgnoreCase("End")) {

                System.out.println("Server Recieved  " + message);

                for (PrintWriter o : ServerLogin.al) {
                    o.println(Username + ": " + message);
                }
                
                String TimeStamp = new SimpleDateFormat(
                                        "MM/dd/yyyy HH:mm:ss"
                                   ).format(new Date()) 
                                   + " " + Username 
                                   + ": " + message;
                ServerLogin.pwLog.println(TimeStamp);
                System.out.println("Server is Logging " + TimeStamp);
                message = nis.readLine();
                
            }
            nos.println("End");
            ServerLogin.al.remove(nos);
        } catch (Exception e) {
            System.out.println(
                    "Client Seems to have abruptly closed the connection"
            );
        }
        System.out.println("Conversation thread  "
                + Thread.currentThread().getName()
                + "   signing Off");
    }
}*/