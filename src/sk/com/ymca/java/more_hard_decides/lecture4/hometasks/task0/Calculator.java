package sk.com.ymca.java.more_hard_decides.lecture4.hometasks.task0;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Calculator {

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

    public double calculate(double operandA, String sign, double operandB) {
        double answer = 0.0;
        switch (sign) {
            case "+":
                answer = operandA + operandB;
                break;
            case "-":
                answer = operandA - operandB;
                break;
            case "*":
                answer = operandA * operandB;
            case "/":
                if (operandB == 0) throw new ArithmeticException(
                        ITaskConstants.IColors.YELLOW +"Devided byzero" + ITaskConstants.IColors.RESET
                );
                else answer = operandA / operandB;
                break;
            default:
                System.out.println(
                        ITaskConstants.IColors.RED + "You enter incorrect symbol!" +
                                ITaskConstants.IColors.RESET
                );
        }
        return answer;
    }
}
