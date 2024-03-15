package sk.com.ymca.java.start.inevidualpractica.maks.methods.ex4;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        System.out.println("Enter your amount of money: ");
        Scanner scan = new Scanner(System.in);
        float amountOfMoney = scan.nextFloat();

        System.out.println("Enter currency of your money: ");
        String currency1 = scan.next();

        System.out.println("Enter the type of currency in which you would like to transfer your money: ");
        String currency2 = scan.next();

        String firstCurrency = currency1.toLowerCase();
        String secondCurrency = currency2.toLowerCase();

        System.out.println("Enter the " + firstCurrency + " to " + secondCurrency + " conversion rate: ");
        float conversionRate = scan.nextFloat();

        System.out.println(amountOfMoney + " " + currency1 + " = " + amountOfMoney * conversionRate + " " + secondCurrency);

        scan.close();
    }
}
