package sk.com.ymca.java.start.lecture8.classwork.ex4;

public class Main {

    public static void main(String[] args) {

        if (args.length > 0){
            System.out.println(args[1]);
        }else {
            main();
        }
    }

    public static void main() {
        System.out.println("This is usual main method without 'String[] args' ");
    }
}
