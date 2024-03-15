package sk.com.ymca.java.start.lecture1.practice;

import java.util.Scanner;

public class Arithmetics {
    static  int add(int number1,int number2){
        // Зайвий пробіл
        return  number1 + number2;
    }

    static  int sub(int number1,int number2){
        // Зайвий пробіл
        return  number1 - number2;
    }

    static  int mul(int number1,int number2){
        // Зайвий пробіл
        return  number1 * number2;
    }

    static  int div(int number1,int number2){
        /*
         1) Зайвий пробіл
         2) Немає перевірки ділення на 0
         */
        return  number1 / number2;
    }
    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        System.out.println("Enter arithmetic operation: ");
        String operation = scan.next();

        System.out.println(" Enter second number: "); // Зайвий пробіл між Enter та лапками
        int number3 = scan.nextInt();

        int result = 0;

        /*
        Тут все ок
        (За бажанням) перероби з оператора else if на switch
         */
        if (operation.equals("+")) {
            result = add(number1, number3);
        } else if (operation.equals("-")) {
            result = sub(number1, number3);
        } else if (operation.equals("*")) {
            result = mul(number1, number3);
        } else if (operation.equals("/")) {
            result = div(number1, number3);
        } else {
            System.out.println("Invalid input");
        }
        System.out.println(result);
    }

    // не закрив об'єкт класа Scanner ( scan.close(); )
}
