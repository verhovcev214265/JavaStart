package sk.com.ymca.java.start.lecture3.classwork.ex3Arithmetic;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Arithmetic {
    // Arithmetic operators: +, -, *, /, %

    public static void main(String[] args) {

        // Addition
        byte num1 = 1, num2 = 2; // Множине оголошення
        int sum = num1 + num2;
        System.out.println(sum + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Subtraction
        byte minuend = 5, subtrahend = 3;
        int difference = minuend - subtrahend;
        System.out.println(difference + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Multiplication
        byte factor1 = 2, factor2 = 3;
        int product = factor1 * factor2;
        System.out.println(product + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Division
        byte dividend = 5, divisor = 2;
        int quotient = dividend / divisor;
        System.out.println(quotient + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Remainder after division (%)
        int remainder = dividend % divisor;
        System.out.println(remainder + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

    }
}
