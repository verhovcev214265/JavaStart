package sk.com.ymca.java.start.lecture6.homeassignment.task4;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        System.out.println("Enter height:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();               // Кількість рядків у трикутнику

        for (int i = 1; i <= height; i++) {
            // Додаємо пробіли до кількості, яка залежить від номеру рядка
            for (int j = (height - i); j >= 1; j--) {
                System.out.print(" ");
            }
            // Додаємо зірочки до кількості, яка залежить від номеру рядка
            for (int k = 1; k <= ((i * 2) - 1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
