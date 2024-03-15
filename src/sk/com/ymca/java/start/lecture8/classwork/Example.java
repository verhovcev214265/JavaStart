package sk.com.ymca.java.start.lecture8.classwork;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Example {

    static void method(int n) {
        while (n > 0) {
            System.out.print("*");
            n--;
        }
    }

    static void recursion(int n) {

        if (n == 0) return;
        System.out.print("*");

        recursion(n - 1);
    }

    static void brackets(int number) {
        number--;

        System.out.print("(");

        if (number > 0) {
            brackets(number);
        }

        System.out.print(")");
    }

    static void brackets2(int number){

        if (number == 0) return;

        System.out.print("(");

        brackets2(number - 1);

        System.out.print(")");
    }

    public static void main(String[] args) {

        method(3);
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        recursion(3);
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        brackets(3);
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        brackets2(3);
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
    }
}
