package sk.com.ymca.java.start.lecture3.classwork.ex9TypesComparsion;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class TypesComparison {
    public static void main(String[] args) {

        boolean resultOfNumbers;
        boolean resultOfStringsLinks;
        boolean resultOfStringsValues;
        boolean resultOfSymbols;
        boolean resultOfSymbols2;

        int number1 = 1;
        float number2 = 2.0f;

        // Можемо порівнювати типи int та float
        resultOfNumbers = number1 == number2;
        System.out.println(
                resultOfNumbers + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
        );

        // Pull of Strings in Java Memory Model
        String myString1 = "Hello";
        String myString2 = "Hello";
//        myString1 + 1;
        myString1 += 1;
        myString2 += 1;
        System.out.println(
                myString1 + "\n" + myString2 +
                        ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
        );

        // Порівняння типів String та int недопустимі
//        result1 = myString1 < number1
        resultOfStringsLinks = myString1 == myString2;
        resultOfStringsValues = myString1.equals(myString2);

        System.out.println(
                "myString1 == myString2 = " + resultOfStringsLinks + "\n" +
                        "myString1.equals(myString2) = " + resultOfStringsValues +
                        ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
        );

        // 16-ich number format
        char mySymbol = 0x0001;
        int myNumber = 1;
        resultOfSymbols = myNumber < mySymbol;
        resultOfSymbols2 = myNumber == mySymbol;

        System.out.println(
                "mySymbol = " + mySymbol + "\n" + "myNumber = " + myNumber +
                        "\n" + resultOfSymbols + "\n" + resultOfSymbols2
        );

    }
}
