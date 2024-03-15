package sk.com.ymca.java.start.lecture1.practice;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double курс$ = 36.92; // переіменуй змінну на англійську

        double euro$ =40.86; // постав пробіл між знаком = та числом 40.86
        /*
         А взагалі по умові курс валют має вводити користувач, тобто вводить суму грошей наприклад в євро (1000)
         Потім вводить курс по відношенню до гривні наприклад (41.6) і отримує відповідь
         */

        System.out.print("Enter an amount of money in a specific currency: ");
        double amount = scanner.nextDouble();

        // Зайвий пробіл
        double convertedAmount = convertCurrency(amount, курс$);
        double convertedAmount2 = convertCurrency(amount, euro$);

        System.out.println("Conversion result: " + convertedAmount);
        System.out.println("Conversion result: " + convertedAmount2);

        // не закрив об'єкт класа Scanner ( scan.close(); )

    }

    // Сам метод ок.
    public static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
