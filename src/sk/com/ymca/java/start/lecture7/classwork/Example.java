package sk.com.ymca.java.start.lecture7.classwork;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Example {

    static short addition(short argument) {
        return ++argument;
    }

    static int addition(int argument){
        return ++argument;
    }

    static int addition(int argument, int argument2){
        return ++argument;
    }

    static String function(String name) {
//       String greeting = "Hello" + name;
//       return greeting;
        return "Hello " + name;
    }

    static double sum(int number1, double number2, int number3){
        return  number1 + number2 + number3;
    }

    static String borisJonson(){
        return "Добрий день everybody";
    }

    static void rectangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void rectangle(int height, int width, char symbol){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println(addition((short) 5)+ ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        short result = addition((byte) 5);
        System.out.println(result+ ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        int result2 = addition(9);
        System.out.println(result2);

        int result3 = addition(2, 9);

        result += 100;
        System.out.println(result + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        System.out.println(function("Oleksandr")+ ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        String myGreeting = function("Garick");
        System.out.println(myGreeting + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        double sum1 = (int) sum(10, 15, 25);
        double sum2 = sum(11, 15.0f, 26);

        System.out.println(sum1 + ITaskConstants.NEW_LINE + sum2 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        String boris = borisJonson();
        System.out.println(boris + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        rectangle();
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        rectangle(5, 7, '\u2663');

    }


}
