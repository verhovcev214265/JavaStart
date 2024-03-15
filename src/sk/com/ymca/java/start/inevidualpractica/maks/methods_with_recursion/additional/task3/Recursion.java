package sk.com.ymca.java.start.inevidualpractica.maks.methods_with_recursion.additional.task3;

import java.util.Scanner;

public class Recursion {

    /*
     Зміни ім'я метода, він друкує дужки от і назви його (printsBrackets);
     Також зміни ім'я змінної яку приймає метод, вона ж визначає кількість дужок от хай і буде (numbers, numbersOfBrackets)
     */

    static void recursion(int iterations) {
        // (За бажанням, подумай як скоротити код) =)
        --iterations;
        System.out.print("(");

        if (iterations > 0) {
            recursion(iterations);
        }
        System.out.print(")");
    }

    public static void main(String[] args) {
        System.out.println("enter the number of iterations: ");
        Scanner scan = new Scanner(System.in);
        int iterations = scan.nextInt();

        recursion(iterations);
    }

    // Все інше ок))
}