package sk.com.ymca.java.start.lecture4.classwork.ex12_Switch;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        // why Scanner and exit here? (Maks, Vlada)
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println(
                    "Enter the day of the week number: 1,2,3,4,5,6,7:\n" +
                            "Exit another button."
            );
            int myDay = sc.nextInt();

            switch (myDay) {
                case 1:
                    System.out.println(
                            "Monday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                case 2:
                    System.out.println(
                            "Tuesday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                case 3:
                    System.out.println(
                            "Wednesday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                case 4:
                    System.out.println(
                            "Thursday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                case 5:
                    System.out.println(
                            "Friday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                case 6:
                    System.out.println(
                            "Saturday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                case 7:
                    System.out.println(
                            "Sunday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
                    );
                    break;
                default:
                    System.out.println(
                            "Bye - bye."
                    );
                    exit = true;
            }
        }
    }

}
