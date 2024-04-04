package sk.com.ymca.java.start.lecture3.classwork.ex7InDec;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class InDec {

    /* Оператори Інкремента і Декремента (Increment and Decrement Operators)
       Increment - Збільшення числа на одиницю
       Decrement - Зменшення числа на одиницю
     */

    public static void main(String[] args) {

        System.out.println("Pre-increment ");

        byte number2 = 0;
        System.out.println(++number2 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);


        System.out.println("Post-increment");

        byte number1 = 0;
        System.out.println(
                number1++ + ITaskConstants.NEW_LINE + number1 + ITaskConstants.NEW_LINE +
                        ITaskConstants.DELIMITER)
        ;

        System.out.println("Post-decrement");

        byte number3 = 0;
        System.out.println(
                number3-- + ITaskConstants.NEW_LINE + number3 + ITaskConstants.NEW_LINE +
                ITaskConstants.DELIMITER
        );

        System.out.println("Pre-decrement");

        byte number4 = 0;
        System.out.println(--number4 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Examples:

        byte var1 = 10;
        System.out.println(++var1 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        byte var2 = 9;
        System.out.println(--var2 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        byte var3 = 8;
        System.out.println(var3++ + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER + var3);

        byte var4 = 7;
        System.out.println(var4-- + ITaskConstants.NEW_LINE + var4 + ITaskConstants.DELIMITER);

        int a = 8;
        int b = a++ + 2;
        System.out.println(
               "a = " + a + ITaskConstants.NEW_LINE + "b = " + b +  ITaskConstants.NEW_LINE +
                        ITaskConstants.DELIMITER
        );


        // Всі арефметичні дії включаючи відсоток по модулю

        int i = 0;
        i = i + 10;

        i += 10;

        i = i + 5;
        i += 5;

        i = i - 10;
        i -= 10;

        i = i % 2;
        i %= 2;

        int num = 1;
        num -= 10;
        System.out.println(num);
        num = 10 - num;
        System.out.println(
                num + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
        );

        int varA = 10;
        int varB = varA++ + 2;
        System.out.println(varA + "\n" + varB +
                ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
        );

        int varC = 10;
        int varD = ++varC + 2;
        System.out.println("Matvey = " + varC + "\n" + varD +
                ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
        );

    }
}
