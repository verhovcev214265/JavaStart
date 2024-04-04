package sk.com.ymca.java.start.lecture3.classwork.ex1ConstantFinal;

public class ConstantFinal {
    public static void main(String[] args) {

        int a = 1;
        System.out.println(a);

        a = 2;
        System.out.println(a);

        final double PI = 3.1415;

//        Намаганя перезаписати константу приводить до помилки компіляції!!!
//        PI = 3.1516;

        System.out.println(PI);
    }
}
