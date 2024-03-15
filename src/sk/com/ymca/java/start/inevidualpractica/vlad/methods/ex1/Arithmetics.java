package sk.com.ymca.java.start.inevidualpractica.vlad.methods.ex1;

import java.util.Scanner;

public class Arithmetics {
    static float add(float num1, float num2) {
        return num1 + num2;
    }

    static float sub(float num1, float num2) {
        return num1 - num2;
    }

    static float mul(float num1, float num2) {
        return num1 * num2;
    }

    static void div(float num1, float num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("дядя на ноль делить нельзя");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 1; ) {
            System.out.println("enter variable1");
            float numbers1 = scan.nextFloat();

            System.out.println("enter symbol");
            String sign = scan.next();

            System.out.println("enter variable2");
            float numbers2 = scan.nextFloat();

            switch (sign) {
                case "/":
                    div(numbers1, numbers2);
                    break;
                case "*":
                    System.out.println(mul(numbers1, numbers2));
                    break;
                case "+":
                    System.out.println(add(numbers1, numbers2));
                    break;
                case "-":
                    System.out.println(sub(numbers1, numbers2));
                    break;
            }
            System.out.println("чтобы выйти введите 'e' ");
            String exit = scan.next();
            if (exit == "e") {
                i++;
            }
        }
    }
}
