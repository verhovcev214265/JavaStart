package sk.com.ymca.java.start.lecture7.practice;

import java.util.Scanner;

public class Calculator {

    static int calculator(int arg1, int arg2, int arg3){
        return (arg1 + arg2 + arg3) / 3;
    }

    public static void main(String[] args) {

        System.out.println("Enter number1:");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();

        System.out.println("Enter number2:");
        int input2 = sc.nextInt();

        System.out.println("Enter number3:");
        int input3 = sc.nextInt();

        int arithmeticMean = calculator(input1, input2, input3);
        System.out.println(arithmeticMean);

        sc.close();
    }
}
