package sk.com.ymca.java.start.lecture3.homework.task1;

public class Main {

    public static void main(String[] args) {

        int x = 10, y = 12, q = 3;

        x += y - x++ * q;
        System.out.println(x);

        q = --x - y * 5;
        System.out.println(q);

        y /= x + 5 % q;
        System.out.println(y);

        q = x++ + y * 5;
        System.out.println(q);

        x = y - x++ * q;
        System.out.println(x);

    }
}
