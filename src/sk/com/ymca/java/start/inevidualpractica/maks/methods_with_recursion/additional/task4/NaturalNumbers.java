package sk.com.ymca.java.start.inevidualpractica.maks.methods_with_recursion.additional.task4;

import java.util.Scanner;

public class NaturalNumbers {

    /*
    Не погано))
    За бажанням подумай як зробити простіше.
    Підказка: рішення дуже схоже як в задачі з дужками =)
     */
    static void recursion(int number, int auxiliaryNumber) {
        ++auxiliaryNumber;
        System.out.print(auxiliaryNumber + " ");

        if (auxiliaryNumber < number) recursion(number, auxiliaryNumber);
    }

    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int auxiliaryNumber = 0;

        recursion(number, auxiliaryNumber);
    }
}
