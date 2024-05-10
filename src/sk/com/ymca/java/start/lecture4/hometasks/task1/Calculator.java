package sk.com.ymca.java.start.lecture4.hometasks.task1;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.Scanner;

/*
    Напишіть програму – консольний калькулятор.
    Створіть дві змінні з іменами operand1 та operand2. Задайте змінним деякі
    довільні значення. Запропонуйте ввести знак арифметичної операції. Прийміть
    значення, введене користувачем, і помістіть його в рядкову змінну sign.
    Для організації вибору алгоритму обчислювального процесу використовуйте перемикач switch.
    Виведіть на екран результат виконання арифметичної операції.
    У разі використання операції розподілу, організуйте перевірку спроби розподілу на нуль. І якщо
    така є, то скасуйте виконання арифметичної операції та повідомите про помилку
    користувача
*/

public class Calculator {
    public static void main(String[] args) {

        double operand1;
        double operand2;
        String sign;
        String choose;
        boolean exit = false;

        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.println(
                    "Hi, start program press any button.\n" +
                            "exit press 'q'."
            );
            choose = sc.next();
            if (choose.equals("q")) {
                exit = true;
                System.out.println("bye - bye");
            } else {
                System.out.println("Enter first number:");
                operand1 = sc.nextDouble();
                System.out.println("Enter the sign of the arithmetic operation (+), (-), (*), (/):");
                sign = sc.next();
                System.out.println("Enter second number: ");
                operand2 = sc.nextDouble();

                switch (sign) {
                    case "+":
                        System.out.println(operand1 + operand2);
                        break;
                    case "-":
                        System.out.println(operand1 - operand2);
                        break;
                    case "*":
                        System.out.println(operand1 * operand2);
                        break;
                    case "/":
                        if (operand2 != 0) {
                            System.out.println(operand1 / operand2);
                        } else {
                            System.out.println(
                                    ITaskConstants.IColors.RED +
                                            "It is forbidden to divide by 0" +
                                            ITaskConstants.IColors.RESET
                            );
                        }
                        break;

                    default:
                        System.out.println(
                                ITaskConstants.IColors.RED + "You enter incorrect symbol!" +
                                        ITaskConstants.IColors.RESET
                        );
                }
            }
        }
    }
}
