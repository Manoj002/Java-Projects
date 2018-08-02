package monitorsthreadinteferencelocalvariable;

public class MonitorsThreadInteferenceLocalVariable {

    public static void main(String[] args) {
        System.out.println("Start Race...");
        Car car = new Car();
        Bike bike = new Bike();
        car.setName("Car");
        bike.setName("bike");
        car.start();
        bike.start();
        try {
            car.join();
            bike.join();
        } catch(InterruptedException ex) {
            System.out.println("InterruptedException");
        }
        System.out.println("Race Ends...");
    }
    
}

class TestBed {
    
    public void busyTracks() {
        
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " Enter busy Tracks ");
        int lap = 0;
        for(lap = 0; lap < 5; lap++) {
            String str = String.format("%s in lap %d %s ", 
                    t.getName(), 
                    lap, 
                    t.getName().equals("Car")?"brrroooommmmsssss":"vrrrroooooommmmmmsss");
            System.out.println(str);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
        System.out.println(t.getName() +" leaves busy Tracks...");
    }
}


class Car extends Thread {
    
    @Override
    public void run() {
        System.out.println("Car starts journey...");
        TestBed a = new TestBed();
        a.busyTracks();
        System.out.println("Car ends journey");
    }
    
}

class Bike extends Thread {
    
    @Override
    public void run() {
        System.out.println("Bike starts journey...");
        TestBed a = new TestBed();
        a.busyTracks();
        System.out.println("Bike ends journey");
    }
}