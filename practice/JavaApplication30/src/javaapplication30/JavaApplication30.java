package javaapplication30;

public class JavaApplication30 {

    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "crow";
        String str3 = "cat";
        String str4;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        str4 = str1 + str2 + "ok";
        System.out.println(str4);
        str1 = str1.concat(str4);
        str2 = str2.intern().concat(str4);
        str3 = str3.replace(str3, str4);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        if(str1 == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
    
}
