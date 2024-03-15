package sk.com.ymca.java.start.lecture7.classwork.ex9;

import java.util.Scanner;

public class Range {

    static double sum(double number1, double number2){
        double sum = 0.0;
        if (number1 > number2){
            double temp = number1;
            number1 = number2;
            number2 = temp;
            /*
            a = a + b;
            b = a - b;
            a = a - b;
             */
        }
        for (double i = (number1 + 1.0); i < number2; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Enter number 1:");
        Scanner sc = new Scanner(System.in);
        double inputNum1 = sc.nextDouble();

        System.out.println("Enter number 2:");
        double inputNum2 = sc.nextDouble();

        System.out.println(sum(inputNum1, inputNum2));
    }
}
