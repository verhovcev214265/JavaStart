package sk.com.ymca.java.start.inevidualpractica.maks.methods.ex4.ex3;

import java.util.Scanner;

public class Arithmetics {

    static double add(double number1, double number2) {
        return number1 + number2;
    }

    static double sub(double number1, double number2) {
        return number1 - number2;
    }

    static double mul(double number1, double number2) {
        return number1 * number2;
    }

    static void div(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("You can't divide by zero");
        } else {
            double div = number1 / number2;
            System.out.println(div);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();

        System.out.println("Enter arithmetic operation: ");
        String operation = scan.next();

        System.out.println(" Enter second number: ");
        double number2 = scan.nextDouble();

        switch (operation) {
            case ("+"):
                double result = add(number1, number2);
                break;
            case ("-"):
                result = sub(number1, number2);
                break;
            case ("*"):
                result = mul(number1, number2);
                break;
            case ("/"):
                div(number1, number2);
                break;
            default:
                System.out.println("You entered the wrong symbol");
        }
    }

}