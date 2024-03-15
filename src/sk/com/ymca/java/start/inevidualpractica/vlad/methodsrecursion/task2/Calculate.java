package sk.com.ymca.java.start.inevidualpractica.vlad.methodsrecursion.task2;

import java.util.Scanner;

/*
Створіть метод з ім'ям calculate, який приймає як параметри три цілих
значення та повертає значення кожного аргументу, поділеного на 5.
 */

public class Calculate {
    static void main(int a, int b, int c) {
        int div1 = a / 5;
        int div2 = b / 5;
        int div3 = c / 5;

        System.out.println(div1 + "\n" + div2 + "\n" + div3);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        main(number1, number2, number3);
    }
}
