package com.rajeshpatkar;

public class Party {
    
    private Friend[] dinningtable1 = new Friend[100];
    
    public Party(Bill b) {
        b.setFriends(dinningtable1);
    }
    
    public void sing() {
        for(Friend f : dinningtable1) {
            f.singASong();
        }
    }
}