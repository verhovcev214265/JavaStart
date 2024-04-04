package sk.com.ymca.java.start.lecture3.classwork.ex12Concatination;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Concatenation {
    // Об'єднання рядків

    public static void main(String[] args) {

        // Варіант_1
        String word1 = "Hello";
        String word2 = "World!";
        final String SPACE = " ";
        String phrase = word1 + SPACE + word2;
        System.out.println(phrase + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Варіант_2
        System.out.println("Hello" + " " + "World!");
    }
}
