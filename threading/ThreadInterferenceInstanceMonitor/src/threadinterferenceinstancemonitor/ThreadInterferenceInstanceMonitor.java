package threadinterferenceinstancemonitor;

public class ThreadInterferenceInstanceMonitor {

    public static void main(String[] args) {
        System.out.println("Start Race");
        Car car = new Car();
        Bike bike = new Bike();
        car.setName("Car");
        bike.setName("Bike");
        car.start();
        bike.start();
        try {
            car.join();
            bike.join();
        } catch (InterruptedException ex) {
            System.out.println("Join interrupted " + ex);
        }
        System.out.println("End Race");
    }
    
}

class Regulator {

    static TestBed a = new TestBed();
    static TestBed b = new TestBed();
}

class TestBed {
    
    int lap = 0;
    Object lapmonitor = new Object();

    public void busyTracks() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " Enters busyTracks");
        synchronized (lapmonitor) {
            for (lap = 0; lap < 5; lap++) {
                String str = String.format(
                        "%s in Lap %d %s of busyTracks",
                        t.getName(),
                        lap,
                        t.getName().equals("Car") ? 
                                    "brrrrooms" : "vrrrrooms"
                );
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrup ̰ted");
                }
            }
        }
        System.out.println(t.getName() + " Leaves busyTracks");
    }
    
    public void busyLanes() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " Enters busyLanes");
        synchronized (lapmonitor) {
            for (lap = 0; lap < 5; lap++) {
                String str = String.format(
                        "%s in Lap %d %s of busyLanes",
                        t.getName(),
                        lap,
                        t.getName().equals("Car") ? 
                                    "brrrrooms" : "vrrrrooms"
                );
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread ̰interrupted");
                }
            }
        }
        System.out.println(t.getName() + " Leaves busyLanes");
    }
}

class Car extends Thread {

    @Override
    public void run() {
        System.out.println("Car Starts Journey");
        Regulator.a.busyTracks();
        System.out.println("Car Ends Journey");
    }
}

class Bike extends Thread {

    @Override
    public void run() {
        System.out.println("Bike Starts Journey");
        Regulator.a.busyLanes();
        System.out.println("Bike Ends Journey");
    }
}