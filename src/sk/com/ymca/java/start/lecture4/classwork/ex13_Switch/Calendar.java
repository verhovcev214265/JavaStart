package sk.com.ymca.java.start.lecture4.classwork.ex13_Switch;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        // Проливання
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter the day of the week number: 1,2,3,4,5,6,7: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println(
                            "Today is a working day"
                                    + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                case 6:
                case 7:
                    System.out.println(
                            "Finally today is a day off"
                                    + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                default:
                    System.out.println("Bye - bye.");
                    exit = true;
            }
        }

    }
}
