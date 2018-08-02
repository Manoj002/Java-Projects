package threadstates;

public class ThreadStates {
    
    static Thread m;
    static Thread t1;
    static Work2 t2;

    public static void main(String[] args) {
        System.out.println("Welcome to Threading");
        m = Thread.currentThread();
        Work1 w1 = new Work1();
        t1 = new Thread(w1);
        System.out.println("State of t1 " + t1.getState());
        t2 = new Work2();
        t1.setName("t1");
        t2.setName("t2");
        System.out.println("State of t2 " + t2.getState());
        System.out.println("Starting Thread t1");
        t1.start();
        System.out.println("State of t1 " + t1.getState());
        System.out.println("Starting Thread t2");
        t2.start();
        System.out.println("State of t2 " + t2.getState());
        Thread t = Thread.currentThread();
        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName() +" says hello " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
        System.out.println("main is going to sleep for atleast 10 seconds");
        try {
            t.sleep(10000);
            System.out.println("Main performing join on t1");
            t1.join();
        } catch(InterruptedException ex) {
            System.out.println("InterruptedException");
        }
        System.out.println("State of t1 " + t1.getState());
        System.out.println("State of main " + t.getState());
        System.out.println("Main performing join on t2");
        try {
            t2.join();
        } catch(InterruptedException ex) {
            System.out.println("InterruptedException");
        }
        System.out.println("State of t2 " + t2.getState());
        try {
            t.sleep(5000);
        } catch(InterruptedException ex) {
            System.out.println("InterruptedException");
        }
    }
    
}

class Work1 implements Runnable {
    
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName() + " says hello " + i);
            System.out.println("t1 says State of main " + ThreadStates.m.getState());
            System.out.println("t1 says state of t1 " + ThreadStates.t1.getState());
            System.out.println("t1 says state of t2 " + ThreadStates.t2.getState());
            try {
                Thread.sleep(10000);
            } catch(InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
        System.out.println("State of t1 " + t.getState());
        System.out.println("State of main " + ThreadStates.m.getState());
        System.out.println("Ending Thread t1...");
    }
}

class Work2 extends Thread {
    
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName() + " says hello " + i);
            System.out.println("t2 says state of main " + ThreadStates.m.getState());
            System.out.println("t2 says state of t1 " + ThreadStates.t1.getState());
            System.out.println("t2 says state of t2 " + ThreadStates.t2.getState());
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("InterruptedException");
            }
            System.out.println("State of t2 " + t.getState());
            System.out.println("State of main " + ThreadStates.m.getState());
            System.out.println("State of t1 " + ThreadStates.t1.getState());
        }
        System.out.println("Ending Thread t2...");
    }
}