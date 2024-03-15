package sk.com.ymca.java.start.lecture9.practice.ex1;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.Scanner;

public class SimpleSplitWordsAndLetters {
    public static void main(String[] args) {

        System.out.println("Enter a text:");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + "th word is: " + words[i]);
            char[] letters = words[i].toCharArray();
            for (int j = 0; j < letters.length; j++) {
                System.out.println((j + 1) + "th letter is: " + letters[j]);
            }
            System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
        }

        scan.close();
    }
}
