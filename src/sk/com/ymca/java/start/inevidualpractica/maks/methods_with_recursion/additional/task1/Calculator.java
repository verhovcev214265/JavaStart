package sk.com.ymca.java.start.inevidualpractica.maks.methods_with_recursion.additional.task1;

import java.util.Scanner;

/*
Використовуючи IntelliJ IDEA, створіть клас Calculator.
Створіть метод з ім'ям calculate, який приймає як параметри три цілих
значення та повертає значення кожного аргументу, поділеного на 5.
 */

public class Calculator {

    // Перероби метод так щоб він приймав 3-и аргументи (подумай якого типу має бути метод)
    static double calculate(double number){

        return number / 5;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();

        double sub = calculate(number);
        System.out.println(sub);
    }
}
