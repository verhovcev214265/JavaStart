package sk.com.ymca.java.start.lecture4.hometasks.task2;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter number from 0 to 100");
            int input = sc.nextInt();

            if (input > 0 && input <= 14){
                System.out.println("Your number interval = [0 - 14]" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
            } else if (input >= 15 && input <= 35) {
                System.out.println("Your number interval = [15 - 35]" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
            } else if (input >= 36 && input <= 50) {
                System.out.println("Your number interval = [36 - 50]" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
            } else if (input >= 50 && input <= 100) {
                System.out.println("Your number interval = [50 - 100]" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
            }else {
                System.out.println(ITaskConstants.IColors.RED + "your number does not fall into any of the ranges from 0 to 100" +
                        ITaskConstants.IColors.RESET + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
            }

        }
    }
}
