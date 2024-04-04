package sk.com.ymca.java.start.lecture3.classwork.ex13StringFormat;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class StringFormat {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        // Форматування рядків за допомогою метода format класу String
        System.out.println(String.format("This number is %1$s", a));

        /*
        Метод printf() належить класу PrintStream, який відповідаєза вивід інформації
        і повертає рядок, відформатований  згідно заданих умов.
         */
        System.out.printf("This number is %1$s \n", a);
        System.out.printf("This numbers are %1$s and %2$s \n", b, c);
        System.out.println("This numbers are " + b + " and " + c);
        System.out.printf("This numbers vise versa %2$s and %1$s \n", b, c);

        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        String name = "John";
        String message = String.format("Hello, %s!", name);
        System.out.println(message);

        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Форматування числа Пі з точністю до двох знаків після коми
        final double PI = Math.PI;
        String formatter = String.format("\n%1$+017.5f", PI);
        System.out.println(formatter);

        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        System.out.printf("\n%.3f", Math.PI);
    }
}
