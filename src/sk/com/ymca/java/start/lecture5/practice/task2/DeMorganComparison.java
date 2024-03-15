package sk.com.ymca.java.start.lecture5.practice.task2;

public class DeMorganComparison {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c;

        c = !(!a && !b);
        System.out.println("c = " + c);

        c = (a || b);
        System.out.println("c = " + c);

    }
}
