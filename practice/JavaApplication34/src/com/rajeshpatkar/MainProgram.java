package com.rajeshpatkar;

class MainProgram {

    public static void main(String[] args) {
        System.out.println("Create Bill");
        Bill bill = new Bill();
        System.out.println("Show Bill's Interaction with his Friends");
        bill.interactWithFriends();
        bill.interactWithAgents();
        bill.interactWithPartners();
        System.out.println("Party Starts");
        Party party = new Party(bill);
        party.sing();
        System.out.println("Party Ends");
    }
}