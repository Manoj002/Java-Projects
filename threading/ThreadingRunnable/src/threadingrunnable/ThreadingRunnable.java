package threadingrunnable;

public class ThreadingRunnable {

    public static void main(String[] args) {
        System.out.println("Welcome to Threading");
        (new Thread (
                        () -> {
                            Thread t = Thread.currentThread();
                            t.setName("lt");
                            for(int i = 0; i < 5; i ++) {
                                System.out.println(t.getName() 
                                        +" says hello " 
                                        + i);
                                try {
                                    Thread.sleep(1000);
                                } catch(InterruptedException ex) {
                                    System.out.println("InterruptedException");
                                }
                            }
                        })).start();
        
        (new Thread() {
                            @Override
                            public void run() {
                                Thread t = Thread.currentThread();
                                t.setName("at");
                                for(int i = 0; i < 5; i++) {
                                    System.out.println(t.getName()
                                            + " says hello "
                                            + i);
                                    try {
                                        Thread.sleep(1000);
                                    } catch(InterruptedException ex) {
                                        System.out.println("InterruptedException");
                                    }
                                }
                            }
        }).start();
        
        Thread t = Thread.currentThread();
        t.setName("mt");
        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName()
                    + " says hello " 
                    + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
        //Work1 w1 = new Work1();
        //Work2 w2 = new Work2();
        //Thread t1 = new Thread(w1);
        //Thread t2 = new Thread(w2);
        //t1.start();  // start is asynchronous call
        //t2.start();  // start is asynchronous call
        //w2.start(); /*when a class extends class thread object of that class
          //can directly access the thread methods
        //*/
        //t1.setName("Login");
        //t2.setName("Logout");
        //w2.setName("Logout");
        /*Thread t = Thread.currentThread();
        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName() +" says hello " + i );
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }*/
    }
    
}

/*class Work1 implements Runnable{
    
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName() + " says hello " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
    }
}


class Work2 extends Thread {
    
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName() + " says hello " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
}
    
}*/

/*class Work2 implements Runnable {
    
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName() + " says hello " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
}
    
}*/