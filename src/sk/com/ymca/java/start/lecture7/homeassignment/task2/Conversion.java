package sk.com.ymca.java.start.lecture7.homeassignment.task2;

import java.util.Scanner;

public class Conversion {

    static double convertCurrency(double sum, double exchangeRate){
        return sum * exchangeRate;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sum: ");
        double sum = sc.nextDouble();

        System.out.println("Enter exchange rate: ");
        double exchangeRate = sc.nextDouble();

        System.out.println("Your amount after exchange = " + convertCurrency(sum, exchangeRate));

        sc.close();
    }
}
