package sk.com.ymca.java.start.lecture5.homeassignment.task2;

public class LogicOperations {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int q = 15;

        x += y >> x++ * q;
        System.out.println(x);

        q = ++x & y * 5;
        System.out.println(q);

        y /= x + 5 | q;
        System.out.println(y);

        q = x++ & y * 5;
        System.out.println(q);

        x = y << x++ ^ q;
        System.out.println(x);

    }
}
