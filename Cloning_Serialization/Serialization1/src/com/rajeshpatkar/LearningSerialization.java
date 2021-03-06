
package com.rajeshpatkar;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;

public class LearningSerialization {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("D:\\output.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        C1 obj1 = new C1(99, 88);
        System.out.println(obj1);
        oos.writeObject(obj1);
        System.out.println(
                 "successfully written the object in the file"
        );
        System.out.println(
                 "attempting the deserialize the object...."
        );
        FileInputStream fis = new FileInputStream("D:\\output.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        C1 obj3 = (C1) ois.readObject();
        System.out.println("reading compelete .. ");
        System.out.println("printing the deserialized object");
        System.out.println(obj3);

    }
}

 class C1 implements Serializable {

    private int a;
    transient private int b;

    public C1() {
    }

    public C1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "C1{" + "a=" + a + ", b=" + b + '}';
    }

}