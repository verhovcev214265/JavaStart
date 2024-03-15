package sk.com.ymca.java.start.lecture3.classwork.ex6Comparsion;

public class Comparison {
    public static void main(String[] args) {

        // true = 1, false = 0;

        byte value1 = 0, value2 = 1;
        boolean result;

        result = value1 < value2;
        System.out.println("Is less than? answer = " + result);

        result = value1 > value2;
        System.out.println("Is greater than? answer = " + result);

        result = value1 <= value2;
        System.out.println("Is less than or equal? answer = " + result);

        result = value1 >= value2;
        System.out.println("Is greater than or equal? answer = " + result);

        result = value1 == value2;
        System.out.println("Are they equal? answer = " + result);

        result = value1 != value2;
        System.out.println("Are they not equal equal? answer = " + result);

    }
}
