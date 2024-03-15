package sk.com.ymca.java.start.lecture7.homeassignment.task3;

import java.util.Scanner;

public class NumbersCheck {

    static void numberChecking(int number){
        if (number > 0){
            System.out.println("This number is positive");
        } else if (number < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is zero.");
        }

        boolean isPrime = true;
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("This number is prime");
        }else {
            System.out.println("This number is not prime");
        }

        if (number % 2 == 0){
            System.out.println("This number divisible by 2 without remainder");
        }
        if (number % 3 == 0){
            System.out.println("This number divisible by 3 without remainder");
        }
        if (number % 5 == 0){
            System.out.println("This number divisible by 5 without remainder");
        }
        if (number % 6 == 0){
            System.out.println("This number divisible by 6 without remainder");
        }
        if (number % 9 == 0){
            System.out.println("This number divisible by 9 without remainder");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int input = sc.nextInt();

        numberChecking(input);

        sc.close();
    }
}
