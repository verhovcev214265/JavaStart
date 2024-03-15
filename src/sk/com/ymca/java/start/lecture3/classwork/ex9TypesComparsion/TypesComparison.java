package sk.com.ymca.java.start.lecture3.classwork.ex9TypesComparsion;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class TypesComparison {
    public static void main(String[] args) {

        boolean result1;
        boolean result2;
        boolean result2_1;
        boolean result3;
        boolean result3_1;

        int number1 = 1;
        float number2 = 2.0f;
        result1 = number1 == number2; // Можемо порівнювати типи int та float

        String myString1 = "Hello";
        String myString2 = "Hello";
        myString1 += 1;
        myString2 += 1;

        // result1 = myString1 < number1 // Порівняння типів String та int недопустимі
        result2 = myString1.equals(myString2);
        result2_1 = myString1 == myString2;

        System.out.println(result1 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);


        char mySymbol = 0x0001; // 16-ich number format
        result3 = number1 < mySymbol;
        result3_1 = number1 == mySymbol;

        System.out.println(mySymbol + ITaskConstants.NEW_LINE +result3 + ITaskConstants.NEW_LINE + result3_1);

        System.out.println(myString1 + ITaskConstants.NEW_LINE + myString2);
        System.out.println(result1);

        System.out.println(result2 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
        System.out.println(result2_1 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        System.out.println(result3 + ITaskConstants.NEW_LINE + result3_1);



    }
}
