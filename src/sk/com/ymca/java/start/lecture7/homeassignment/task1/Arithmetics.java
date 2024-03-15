package sk.com.ymca.java.start.lecture7.homeassignment.task1;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Arithmetics {

    static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    static double sub(double operand1, double operand2) {
        return operand1 - operand2;
    }

    static double mul(double operand1, double operand2) {
        return operand1 * operand2;
    }

    static void div(double operand1, double operand2) {
        if (operand2 == 0) {
            System.out.println(ITaskConstants.IColors.RED + "Division by zero is not allowed!" + ITaskConstants.IColors.RESET);
        } else {
            System.out.println(operand1 / operand2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {

            System.out.println("Enter operand1:");
            double operand1 = sc.nextDouble();

            System.out.println("Enter arithmetic symbol:\n" +
                    "exit enter any button.");
            String arithmeticSymbol = sc.next();

            System.out.println("Enter operand2:");
            double operand2 = sc.nextDouble();

            switch (arithmeticSymbol) {
                case "+" -> System.out.println(add(operand1, operand2));
                case "-" -> System.out.println(sub(operand1, operand2));
                case "*" -> System.out.println(mul(operand1, operand2));
                case "/" -> div(operand1, operand2);
                default -> {
                    System.out.println("Bye - bye");
                    exit = true;
                }
            }
        }

        sc.close();
    }

}
