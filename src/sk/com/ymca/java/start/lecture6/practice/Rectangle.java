package sk.com.ymca.java.start.lecture6.practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height:");
        int inputHeight = sc.nextInt();

        System.out.println("Enter width:");
        int inputWidth = sc.nextInt();

        for (int i = 0; i < inputHeight; i++) {

            for (int j = 0; j < inputWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
