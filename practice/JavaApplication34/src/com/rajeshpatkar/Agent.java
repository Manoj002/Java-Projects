package com.rajeshpatkar;

public class Agent extends Friend {
    
    private static int count=1;
    private int contracts;
    
    public Agent(){
        super("agent"+count++);
        contracts = count;
    }
    
    public Agent(String name, int contracts){
        super(name);
        this.contracts = contracts;
    }
    
    public int getContracts(){
        return contracts;
    }

    @Override
    public void singASong() {
        System.out.println(getName() + " with " + contracts + " says Bill is great ");
    }
}