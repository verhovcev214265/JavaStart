package sk.com.ymca.java.start.inevidualpractica.nazar.methods.ex1;

import java.util.Scanner;

public class MyMethod {

    public static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount of money in a specific currency: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter your exchange rate");
        double exchangeRate = scanner.nextDouble();

        double convertedAmount = convertCurrency(amount, exchangeRate);

        System.out.println("Conversion result: " + convertedAmount);
    }

}

