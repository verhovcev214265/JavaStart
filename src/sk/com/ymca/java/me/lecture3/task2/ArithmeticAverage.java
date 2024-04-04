package sk.com.ymca.java.me.lecture3.task2;

/*
Завдання 2
Створіть клас Arithmetic Average.
Обчисліть середнє арифметичне трьох цілих значень і виведіть його на екран.

- Проаналізуйте для себе:
З якою проблемою ви зіткнулися?
Який тип змінних краще використовувати для коректного
відображення результату?
 */

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstValue = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double secondValue = sc.nextDouble();

        System.out.println("Enter the third number: ");
        double thirdValue = sc.nextDouble();

        double[] averages = {firstValue, secondValue, thirdValue};
        double sum = 0.0;
        int divider = averages.length;

        for (double average : averages) {
            sum += average;
        }
        double result = sum / divider;

        System.out.println(
                "Arithmetic average = " + result
        );
    }
}
