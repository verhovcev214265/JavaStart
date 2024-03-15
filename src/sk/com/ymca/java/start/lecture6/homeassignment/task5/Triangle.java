package sk.com.ymca.java.start.lecture6.homeassignment.task5;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        /*

         *
         **
         ***
         ****
         *****

         */

        System.out.println("Rectangle --> enter weight:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /*
                  *
                 ***
                *****
               *******
              *********
         */

        System.out.println("Rectangle --> enter weight:");
        int heightRightTriangle = sc.nextInt();

        for (int i = 0; i < heightRightTriangle; i++) {
            for (int j = 0; j < heightRightTriangle - (i - 1); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

        sc.close();
    }
}
