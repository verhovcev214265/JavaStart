package sk.com.ymca.java.start.lecture4.classwork.ex5_Ternary;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Ternary {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = -5;
        int max = 0;

        max = a > b ? (c = a) : (c = b);
        System.out.println(max + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        System.out.println(a > b ? (c = a) : (c = b));

    }
}
