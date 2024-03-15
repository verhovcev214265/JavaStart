package sk.com.ymca.java.start.lecture7.classwork.ex8;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class GuardOperator {

    static String sayHello(String name) {
        if (name.equals("FOOL")) {
            return ITaskConstants.IColors.RED + "Invalid word!" + ITaskConstants.IColors.RESET;
        } else {
            return "Hello " + name;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter your word:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();

        System.out.println(sayHello(input));

    }
}
