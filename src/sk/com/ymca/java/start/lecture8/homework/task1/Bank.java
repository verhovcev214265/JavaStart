package sk.com.ymca.java.start.lecture8.homework.task1;

import java.util.Scanner;

public class Bank {

    static void creditStatus(double payment) {

        double dept = 700;
        double overPayment;
        double currentCredit;

        if (payment < 100) {
            System.out.println("Your payment shouldn't be less than 100$");
        } else {
            if (payment > dept) {
                overPayment = payment - dept;
                System.out.println("Your dept is fully repaid" + "\n" + "Overpayment = " + overPayment);

            } else if (payment == dept) {
                System.out.println("Your dept is fully repaid");
            } else {
                currentCredit = dept - payment;

                System.out.println("Your payment = " + payment + ".\n" + "Current dept = " + currentCredit);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter your payment:");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        creditStatus(input);
    }
}
