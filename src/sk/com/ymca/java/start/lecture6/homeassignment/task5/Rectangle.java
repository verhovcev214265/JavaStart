package sk.com.ymca.java.start.lecture6.homeassignment.task5;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        System.out.println("Rectangle --> enter weight:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        System.out.println("Rectangle --> enter width:");
        int width = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
