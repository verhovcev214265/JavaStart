package sk.com.ymca.java.start.inevidualpractica.maks.methods_with_recursion.task2;

/*
Є N клієнтів, яким компанія-виробник має доставити товар. Скільки існує
можливих маршрутів доставки товару, з урахуванням того, що товар доставлятиме одна машина?
Використовуючи IntelliJ IDEA, створіть клас Delivery.
Напишіть програму, яка розраховуватиме і виводитиме на екран кількість можливих варіантів
доставки товару. Для вирішення задачі, використовуйте факторіал N!, що розраховується за допомогою рекурсії.
Поясніть, чому не рекомендується використовувати рекурсію для розрахунку факторіалу. Вкажіть слабкі
місця цього підходу.
 */

import java.util.Scanner;

public class Delivery {

    // Перероби метод щоб він повертав int
    static void factorial(long number, int counter) {
        number *= --counter;

        if (counter > 1) factorial(number, counter);
        else if (counter < 0) System.out.println("The number of clients can't be less than zero");
        else System.out.println("Quantity of options: " + number);
    }

    public static void main(String[] args) {
        System.out.println("Enter the quantity of clients:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int counter = number; // Зайва змінна

        /*
         Всю цю логіку з (if, else if, else0) реалізуй в методі тут вона не потрібна в методі main має бути лише
         виклик метода factorial
         */
        if (number == 1) System.out.println("Quantity of options: " + number);
        else if (number > 25) System.out.println("This program can't solve under 25 clients");
        else factorial(number, counter);
    }
}
