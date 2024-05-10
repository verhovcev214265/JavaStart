package sk.com.ymca.java.start.lecture5.homeassignment.task1;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean exit = false;

        // First bits check
//        while (!exit) {
//            System.out.println("Enter your number:" + "\n" + "If you want to go out enter (-1)");
//            int input = scan.nextInt();
//
//            if (input != -1){
//                if (input % 2 == 0) {
//                    System.out.println("This number is parity" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
//                } else {
//                    System.out.println("This number isn't parity" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
//                }
//            }else {
//                exit = true;
//                System.out.println("Bye - bye");
//            }
//        }

        // Second

        while (!exit) {
            System.out.println("Enter your number:" + "\n" + "If you want to go out enter (-1)");
            int input = scan.nextInt();

            if (input != -1) {
                if ((input & 1) == 0) {
                    System.out.println("This number is parity" +
                            ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                } else {
                    System.out.println("This number isn't parity" +
                            ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                }
            } else {
                exit = true;
                System.out.println("Bye - bye");
            }
        }

        scan.close();
    }
}
