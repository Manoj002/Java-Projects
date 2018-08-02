package p1;



public class PiggyBank {
    
    private int balance;
    private int lt;
    
    public void deposit(int v) {
        if(v >= 10) {
            balance = balance + v;
            lt = v;
        } else {
            System.out.println("Invalid Amount");
        }
}

    public int getBalance() {
        return balance;
    }

    public int getLt() {
        return lt;
    }
    
    public void withdraw(int v) {
        if(balance >= v) {
            balance = balance - v;
            lt = -v;
        } else {
            System.out.println("Not enough balance");
        }
    }
    
    public void print() {
        System.out.println("Balance = " + balance);
        System.out.println("Last_Transaction = " + lt);
    }
}
