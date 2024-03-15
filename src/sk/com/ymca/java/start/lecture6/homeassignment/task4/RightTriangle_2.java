package sk.com.ymca.java.start.lecture6.homeassignment.task4;

import java.util.Scanner;

public class RightTriangle_2 {
    public static void main(String[] args) {

        System.out.println("Enter height:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
