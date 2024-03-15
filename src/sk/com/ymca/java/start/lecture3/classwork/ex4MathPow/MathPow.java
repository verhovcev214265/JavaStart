package sk.com.ymca.java.start.lecture3.classwork.ex4MathPow;

import static java.lang.Math.pow;

public class MathPow {

    /* Math.pow() возведення числа в ступінь
        1-ий аргумент число яке возводимо в ступіньб
        2-ий показник ступіня, в яку возводимо число.
    */

    public static void main(String[] args) {

        double x = 2, y = 8;
        double result = pow(x, y);
        System.out.println(result);
    }
}
