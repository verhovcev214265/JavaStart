package sk.com.ymca.java.start.lecture7.classwork.ex2;

public class Function {

    static String sayHello(){
        return "Hello ";
    }

    public static void main(String[] args) {

        String hello = sayHello();
        String name = "Anna";

        System.out.println(hello + name);

    }
}
