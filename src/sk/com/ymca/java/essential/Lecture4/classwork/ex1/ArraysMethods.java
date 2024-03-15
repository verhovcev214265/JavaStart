package sk.com.ymca.java.essential.Lecture4.classwork.ex1;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int[] numbers1 = {12, 3, 45, 0, 1, 144}; // sorting elements into array
        int[] numbers2 = {12, 3, 45, 0, 1, 144}; // no sorting

        Arrays.sort(numbers1);

        // виводимо значення нашого масиву за допомоги статичного методу toString класу Arrays
        System.out.println(Arrays.toString(numbers1) + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        int[][] twoDimensionalNumbers = {{1, 7, 6, 8}, {12, -3, 4}, {42, -112, 0, 8, -900}};
        // виводимо значення нашого двовимірного масиву за допомоги статичного методу deepToString класу Arrays
        System.out.println(Arrays.deepToString(twoDimensionalNumbers) + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Пошук елемента в масиві (Відсортованому)
        System.out.println(Arrays.binarySearch(numbers1, 3) + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Порівняння масивів
        System.out.println(Arrays.equals(numbers1, numbers2) + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Заповнити масив 1-им елементом
        Arrays.fill(numbers2, 99);
        System.out.println(Arrays.toString(numbers2) + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        int[] numbers3 = {1, 2, 3, 4, 5};
        int[] numbers4 = {6, 7, 8, 9, 10};

        // Копіює елементи масиву вже в існуючий масив
        System.arraycopy(numbers3, 2, numbers4, 0, 3);
        System.out.println(Arrays.toString(numbers4) + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Копіює елементи масиву повертаючи новий масив.
        int[] numbers5 = Arrays.copyOf(numbers3, 6);
        System.out.println(Arrays.toString(numbers5) + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

////      Не роботи так(чому ?)
//        numbers3 = numbers1;
//        System.out.println(Arrays.toString(numbers3));
    }
}
