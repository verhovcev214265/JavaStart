package sk.com.ymca.java.start.lecture6.homeassignment.task2;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {

        System.out.println("Rectangle --> enter weight:");
        Scanner sc = new Scanner(System.in);
        int rectangleHeight = sc.nextInt();

        System.out.println("Rectangle --> enter width:");
        int rectangleWidth = sc.nextInt();

        for (int i = 0; i < rectangleHeight; i++) {
            for (int j = 0; j < rectangleWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(ITaskConstants.DELIMITER);


        System.out.println("Right triangle --> enter weight:");
        int rightTriangleWeight = sc.nextInt();

        for (int i = 0; i < rightTriangleWeight; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println(ITaskConstants.DELIMITER);


        System.out.println("Equilateral triangle --> enter weight:");
        int equilateralWeight = sc.nextInt();

        for (int i = 1; i <= equilateralWeight ; ++i) {
            for (int j = equilateralWeight; j > i; --j) {
                System.out.print(" ");
            }
            for (int j = 1; j < (2 * i); ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(ITaskConstants.DELIMITER);


        System.out.println("Enter weight:");
        int weight = sc.nextInt();

        int q = 1;
        for (int i = 0; i < (weight / 2) + 1; i++) {
            int spaces = (weight - q) / 2;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < q; k++) {
                System.out.print("*");
            }
            System.out.println();

            q = q + 2;
        }
        q = weight - 2;

        for (int i = weight / 2; i > 0; i--){
            int spaces = (weight - q) / 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < q; k++) {
                System.out.print("*");
            }
            System.out.println();

            q = q - 2;
        }

        System.out.println(ITaskConstants.DELIMITER);

//        System.out.print("Enter weight: ");
//        int weight2 = sc.nextInt();
//
//        int numSpaces = weight2 / 2;
//
//        // Print top half of diamond
//        for (int i = 1; i <= weight2; i += 2) {
//            printRow(numSpaces, i);
//            numSpaces--;
//        }
//
//        // Print bottom half of diamond
//        numSpaces = 1;
//        for (int i = weight2 - 2; i >= 1; i -= 2) {
//            printRow(numSpaces, i);
//            numSpaces++;
//        }
//    }
//
//    // Helper method to print a row of asterisks with a given number of leading spaces
//    private static void printRow(int numSpaces, int numAsterisks) {
//        for (int i = 0; i < numSpaces; i++) {
//            System.out.print(" ");
//        }
//        for (int i = 0; i < numAsterisks; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
        sc.close();
    }
}

