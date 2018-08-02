package com.rajeshpatkar;

public class Friend {
    
    private static int count=1;
    private String name;
    
    public Friend(String name){
        this.name = name;
    }
    
    public Friend(){
        name="Friend"+count++;
    }
    
    public String getName(){
        return name;
    }
    
    public void singASong(){
        System.out.println(name + " Loves Bill");
    }
    
}
