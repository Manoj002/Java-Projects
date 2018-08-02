package pkg4;

public class Main {

    public static void main(String[] args) {
        System.out.println(isprime(5));
        System.out.println(isprime(23));
        fib(9);
        log_base(44);
        log_base(5344);
        prime_factor(611);
        patterns();
        System.out.println(palindrome(2112));
        System.out.println(r_num(667));
        System.out.println(sumOfDigits(3398));
    }

    static boolean isprime(int v) {
        if (v % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= v / 2; i = i + 2) {
            if (v % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void fib(int x) {
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println("Fibonacci series\n");
        for (int i = 1; i < x; i++) {
            System.out.println(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    static void log_base(int v) {
        int p = 0;
        for (; v > 1; v /= 2) {
            p++;
        }
        System.out.println(p);
    }

    static void prime_factor(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0 && isprime(i)) {
                System.out.println(i);
            }
        }
    }

    static void patterns() {
        System.out.println("         Pattern 1\n");
        System.out.println("-----------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("         Pattern 2\n");
        System.out.println("----------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Pattern 3 ");
        System.out.println("------------------------------------");
        for (int i = 5; i > 0; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    static boolean palindrome(int x) {
        if(x == r_num(x)) {
            return true;
        }
        return false;
    }
    
    static int r_num(int x) {
        int rev = 0;
        for(; x > 0; x /= 10) {
            rev *= 10;
            rev += (x % 10);
        }
        return rev;
    }
    
    static int sumOfDigits(int x) {
        int p = 0;
        for(; x > 0; x /= 10) {
            p += (x % 10);
        }
        return p;
    }
}
