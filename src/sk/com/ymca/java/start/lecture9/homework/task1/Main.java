package sk.com.ymca.java.start.lecture9.homework.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayManipulation arrayManipulation = new ArrayManipulation();

        System.out.println("Enter array length:");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int max = arrayManipulation.biggestValue(input);
        int min = arrayManipulation.smallestValue(input);
        int total = arrayManipulation.total(input);
        double arithmeticMean = arrayManipulation.arithmeticMean(input);

        System.out.println(
                "The biggest value = " + max +
                        "\n" + "The smallest value = " + min +
                        "\n" + "Total = " + total +
                        "\n" + "Arithmetic mean = " + arithmeticMean
        );

        arrayManipulation.unpaired(input);
    }
}
