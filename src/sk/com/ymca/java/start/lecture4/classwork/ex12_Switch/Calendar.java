package sk.com.ymca.java.start.lecture4.classwork.ex12_Switch;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Enter the day of the week number: 1,2,3,4,5,6,7: ");
            int myDay = sc.nextInt();

            switch (myDay){
                case 1:
                    System.out.println("Monday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                    break;
                case 2:
                    System.out.println("Tuesday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                    break;
                case 3:
                    System.out.println("Wednesday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                    break;
                case 4:
                    System.out.println("Thursday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                    break;
                case 5:
                    System.out.println("Friday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                    break;
                case 6:
                    System.out.println("Saturday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                    break;
                case 7:
                    System.out.println("Sunday" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
                    break;
                default:
                    System.out.println(ITaskConstants.IColors.RED + "This number the day of the week doesn't exist!");
            }
        }

    }

}
