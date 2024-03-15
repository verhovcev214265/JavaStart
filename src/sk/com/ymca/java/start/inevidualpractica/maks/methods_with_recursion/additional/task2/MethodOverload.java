package sk.com.ymca.java.start.inevidualpractica.maks.methods_with_recursion.additional.task2;

import java.util.Scanner;

public class MethodOverload {

    /*
    Макс все працює =) але треба все переробити, бо сенс цього завдання перегрузка, тобто ти маєш створити 3-и метода:
    1-ий визначає максимальне число 2-ох цілих чисел (зроби його типом int)
    для визначення максимального числа використай тернарний оператор.
    2-ий визначає максимальне число 3-ох метод поумай як зробити так щоб ей метод повернув тобі максимальне число викликаючи при цьому 1-ий метод
    3-ий визначає максимальне число 4-ох метод поумай як зробити так щоб ей метод повернув тобі максимальне число викликаючи при цьому 2-ий метод

    Всі методи мають повертати int
    Масиви не використовуй (хоча я радий що ти їх поюзав =) )
     */
    static void method(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1);
        } else if (number2 > number1) {
            System.out.println(number2);
        } else  {
            System.out.println(number1 + "=" + number2);
        }
    }

    static int method(int number1, int number2, int number3) {
        int [] number = {number1, number2, number3};
        int max = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    static int method(int number1, int number2, int number3, int number4) {
        int [] number = {number1, number2, number3, number4};
        int max = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scan.nextInt();

        System.out.println("Enter third number: ");
        int number3 = scan.nextInt();

        System.out.println("Enter fourth number: ");
        int number4 = scan.nextInt();

        method(number1, number2);
        int result1 = method(number1, number2,number3);
        int result2 = method(number1, number2, number3, number4);

        System.out.println(result1 + "\n" + result2);
    }
}
