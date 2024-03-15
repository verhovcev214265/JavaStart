package sk.com.ymca.java.start.lecture8.classwork.ex2;

public class Difference {

    static int difference(int height, int width) {
        return height - width;
    }

    static int difference(int height, int width, int length) {
        return (height - width) + length;
    }


    public static void main(String[] args) {

        int result;

        result = difference(6, 5);
        result = difference(6, 5);

        result = difference(10,5,15);

        System.out.println("result = " + result);
    }
}
