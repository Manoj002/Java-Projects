package pkg2;

class C2 {

    static void idnstate() {
        int i = 5;
        int j = 9;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        j = 8;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        String str_1 = "Hello";
        String str_2 = "Bye";

        System.out.println("string_1 = " + str_1);
        System.out.println("string_2 = " + str_2);

        str_2 = str_1;

        System.out.println("string_1 = " + str_1);
        System.out.println("string_2 = " + str_2);

        str_1 = "ok";

        System.out.println("string_1 = " + str_1);
        System.out.println("string_2 = " + str_2);
    }
}
