package sk.com.ymca.java.more_hard_decides.lecture3.task3;

/*
Створіть клас Circle.
Створіть константу під назвою PI (число π «пі»),
створіть змінну радіус з назвою – r. Використовуючи
формулу πR2, обчисліть площу кола та виведіть результат на екран.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter radius:");

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double result = Circle.area(radius);

        System.out.println("area = "+ result);
    }
}
