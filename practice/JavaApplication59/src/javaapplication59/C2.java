package javaapplication59;

class C2 {
    
    static boolean flag1 = false;
    static boolean flag2 = true;

    public static void m2() throws F3 {
        System.out.println("Entering m2");
        try {
            System.out.println("Entering try of m2");
            if(flag1) {
                F1 f1 = new F1("error 1");
                throw f1;
            }
            System.out.println("Median");
            if(flag2) {
                throw new F2("error 2", "msg 1");
                //throw f2;
            }
            System.out.println("Leaving try of m2");
        } catch(F1 f) {
            System.out.println("Error caught is " + f.getErrorInfo());
        } catch(F2 f) {
            System.out.println("Error caught is " + f.getErrorInfo() + "\nStack Trace");
            f.printStackTrace();
            throw new F3("error 3", "msg 2", f);
        } finally {
            System.out.println("Finally of m2");
        }
        System.out.println("Leaving m2");
    }
}
