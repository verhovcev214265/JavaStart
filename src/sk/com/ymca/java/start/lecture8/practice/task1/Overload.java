package sk.com.ymca.java.start.lecture8.practice.task1;

public class Overload {

    static int maxValue(int a, int b) {
        return (a > b) ? a : b;
    }

    static int maxValue(int a, int b, int c) {
        return maxValue(maxValue(a, b), c);
    }

    static int maxValue(int a, int b, int c, int d) {
        return maxValue(maxValue(a, b, c), d);
    }


    public static void main(String[] args) {

        int maxTwo = maxValue(0, 0);
        int maxThree = maxValue(100, 33, 2000);
        int maxFour = maxValue(10222, 2022, 50222, 300);

        System.out.println(maxTwo + "\n" + maxThree + "\n" + maxFour);


    }
}
