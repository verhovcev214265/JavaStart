package sk.com.ymca.java.start.lecture9.classwork.fox;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class StringManipulation {

    public static void main(String[] args) {

        String source = "Hello World!";

        /*
         Використовуємо метод split для розділення тексту на слова за доп. regex.
         Метод split повертає масив рядків тому для отримання результату нам необхідно, результат виконання методу
         покласти в масив.
         */
//
        String[] words = source.split(" ");
        /*
        Just memory address because method (toString) can't work by arrays
        System.out.println(words);
        */

        // How can we show array length?

        // How can we refer to an array?

        String[] lettersA = words[0].split("");
        for (String letters : lettersA){
            System.out.print(letters + ", ");
        }
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        char[] lettersB = words[1].toCharArray();
        for (int i = 0; i < lettersB.length; i++) {
            System.out.print(lettersB[i] + ", ");
        }

    }
}
