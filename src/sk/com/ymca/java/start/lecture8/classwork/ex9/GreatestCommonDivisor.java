package sk.com.ymca.java.start.lecture8.classwork.ex9;

import java.util.Scanner;

public class GreatestCommonDivisor {

    static int calculate(int a, int b){
        if (a % b == 0){
            return b;
        }else {
            return calculate(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println("Finding greatest common divisor...\n" +
                "Enter a first number:");

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();

        System.out.println("Enter a second number:");
        int input2 = sc.nextInt();

        System.out.println("a = " + input1 + ", b = " + input2 + ", GCD = " + calculate(input1, input2) + ";");
    }
}
