package sk.com.ymca.java.start.lecture9.homework.task1;

/*
Створити масив розміру елементів N, заповнити його довільними цілими значеннями (розмір
масиву задає користувач).
Вивести на екран: найбільше значення масиву, найменше значення масиву, загальну суму всіх
елементів, середнє арифметичне всіх елементів, вивести всі непарні значення.
 */

import java.util.Random;

public class ArrayManipulation {

    public int biggestValue(int inputLength){

        int[] numbers = new int[inputLength];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) max = numbers[i];
        }

        return max;
    }

    public int smallestValue(int inputLength){

        int[] numbers = new int[inputLength];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        int min = numbers[0];

        for (int number : numbers) {
            if (min > number) min = number;
        }
        return min;
    }

    public int total(int inputLength){

        int[] numbers = new int[inputLength];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        int total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public double arithmeticMean(int inputLength){

        double [] numbers = new double[inputLength];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        double arithmeticMean = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            arithmeticMean += numbers[i];
        }

        return arithmeticMean / numbers.length;
    }

    public void unpaired (int inputLength){

        int[] numbers = new int[inputLength];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Unpaired numbers: ");

        for (int number : numbers) {

            if (number % 2 != 0) {
                System.out.print(number + ", ");
            }
        }
    }
}
