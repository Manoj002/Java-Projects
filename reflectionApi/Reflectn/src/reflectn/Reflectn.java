package reflectn;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Reflectn {
    
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Welcome to Reflection Learning!!!");
        String str = "Hello World";
        Class c = str.getClass();
        System.out.println(c.getName());
        Class s = c.getSuperclass();
        System.out.println("The parent is\n" + s.getName());
        Class [] stypes = c.getInterfaces();
        System.out.println("Interfaces supertypes are:");
        for(Class i: stypes) {
            System.out.println(i.getName());
        }
        System.out.println("List of Constructors");
        Constructor [] constructors = c.getConstructors();
        for(Constructor i: constructors) {
            System.out.println(i.toGenericString());
        }
        System.out.println("List of Methods");
        Method [] m1 = c.getMethods();
        for(Method m : m1) {
            System.out.println(m.toGenericString());
        }
        Field [] f1 = c.getFields();
        System.out.println("List of Fields:");
        for(Field f : f1) {
            System.out.println(f.toGenericString());
        }
    }
}