package sk.com.ymca.java.start.lecture8.practice.task0;

import java.util.Scanner;

public class Calculate {

    static void divForFive(int number1, int number2, int number3){
        System.out.println(number1 / 5 + ", " + (number2 / 5) + ", " + (number3 / 5));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int inputNumber1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int inputNumber2 = sc.nextInt();

        System.out.println("Enter third number: ");
        int inputNumber3 = sc.nextInt();

        divForFive(inputNumber1, inputNumber2, inputNumber3);

        sc.close();
    }
}
