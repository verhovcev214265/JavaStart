package sk.com.ymca.java.start.lecture4.classwork.ex14_Switch;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please chose coffee for yourself:" + "\n" +
                "Espresso, press - 1" + "\n" + "Americano, press - 2" + "\n" + "Latte press - 3");

        int input = sc.nextInt();
        double cost = 0;

        switch (input) {
            case 1:
                cost += 1.8;
                break;
            case 2:
                cost += 2.1;
                break;
            case 3:
                cost += 2.8;
                break;

            default:
                System.out.println(
                        ITaskConstants.IColors.RED + "Wrong choice, please enter 1, 2 or 3!"
                );
        }

        if (cost != 0) {
            System.out.println(
                    "Cost = " + cost + "€" + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
            );
        }

     }
}
