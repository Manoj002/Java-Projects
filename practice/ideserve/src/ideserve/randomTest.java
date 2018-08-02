package ideserve;

import java.util.Random;

public class randomTest {
    
    public static void main(String[] args) {
        Random random_numbr = new Random();
        System.out.println("Random Number:");
        int rn = random_numbr.nextInt(21);
        System.out.println(rn);
    }
}
