package sk.com.ymca.java.start.lecture6.homeassignment.task1;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        int sum = 0;

        for (int i = (a + 1); i < b; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers between 'a' and 'b' = " + sum +
                "\n" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        for (int i = (a + 1); i < b; i++) {
            if (i % 2 != 0) {
                System.out.println("odd = " + i);
            }
        }

        System.out.println(ITaskConstants.DELIMITER);
        sc.close();
    }
}
