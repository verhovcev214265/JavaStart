package sk.com.ymca.java.start.lecture7.classwork.ex4;

public class Function {

    static String sayMeHello(String name) {

//         String sentence = "Hello " + name;
//         return sentence;
        return "Hello " + name;
    }

    public static void main(String[] args) {

        String message = sayMeHello("Vlada");
        System.out.println(message);

        System.out.println(sayMeHello("Oleks"));
    }
}
