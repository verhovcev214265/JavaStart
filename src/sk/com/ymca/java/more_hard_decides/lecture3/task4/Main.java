package sk.com.ymca.java.more_hard_decides.lecture3.task4;

import java.util.Scanner;
/*
Створіть клас Volume.
Напишіть програму розрахунку об'єму -V та площі поверхні -S циліндра.
Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою: V = πR2h
Площа поверхні циліндра обчислюється за формулою:
S = 2πR2 + 2πR2 = 2πR(R+h)
Результати розрахунків виведіть на екран.
 */

public class Main {
    public static void main(String[] args) {

        Volume volume = new Volume();
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println(
                    "Choose the action.\n" +
                            "Calculate volume of cylinder Press 1.\n" +
                            "Calculate area of cylinder Press 2.\n" +
                            "Exit press any button"
            );

            int action = sc.nextInt();
            if (action != 1 && action != 2) {
                System.out.println("Bye - bye");
                exit = true;
            } else {
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                System.out.println("Enter height:");
                double height = sc.nextDouble();
                double result;
                if (action == 1) {
                    result = volume.volumeOfCylinder(radius, height);
                } else {
                    result = volume.areaOfCylinder(radius, height);
                }
                System.out.println(result);
            }
        }

        sc.close();
    }
}
