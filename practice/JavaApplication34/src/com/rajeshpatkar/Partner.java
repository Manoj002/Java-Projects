package com.rajeshpatkar;

public class Partner extends Agent{
    
    private static int count = 1;
    private int revenue;
    
    public Partner( String name,
                    int contracts,
                    int revenue ) 
    {
        super(name,contracts);
        this.revenue = revenue;
    }

    public Partner() {
        super("Partner"+count++,count);
        revenue = count*1000;
    }
    
    @Override
    public void singASong(){
        System.out.println(
                getName() + " with "+ 
                getContracts() +" contracts and "+
                revenue+" in revenue says BILL!!!" 
        );
    }

}