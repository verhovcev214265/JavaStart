package sk.com.ymca.java.start.lecture7.classwork.ex3;

public class Function {

    static String sayHello(){
        String hello = "Hello.";
        return hello;
    }

    public static void main(String[] args) {

        String str = sayHello();
        System.out.println(sayHello() + "\n" + str);
    }
}
