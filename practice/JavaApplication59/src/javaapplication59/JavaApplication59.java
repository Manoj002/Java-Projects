package javaapplication59;

public class JavaApplication59 {
    
    public static void main(String[] args) throws F3 {
        System.out.println("Welcome to exception handling");
        System.out.println("Entering main");
        try {
        System.out.println("Entering try of main");
        C1.m1();
        System.out.println("Leaving try of main");
        } catch(F3 f) {
            System.out.println("Caught error is " + f.getErrorInfo());
            System.out.println("Getting cause " +f.getCause().getMessage());
            throw new F3("error 4", "msg new", f);
        } finally {
            System.out.println("Finally of main");
        }
        System.out.println("Leaving main");
    }
}