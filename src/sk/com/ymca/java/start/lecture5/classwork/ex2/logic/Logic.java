package sk.com.ymca.java.start.lecture5.classwork.ex2.logic;

public class Logic {
    public static void main(String[] args) {
        // Кон'юнкція (AND) &&

        byte operand1;
        byte operand2;
        boolean a = true;
        boolean b = false;
        boolean c;
        int result;

        /*
         Кон'юнкція
         Якщо хоч один з операндів має значення 0 - вся конструкція має значення 0. Інакше 1.

         0 & 0 = 0      0 & 1 = 0
         1 & 0 = 0      1 & 1 = 1
         */

        operand1  = 127;                        //   [0111 1111] - Bin
        operand2 = 1;                           //   [0000 0001] - Bin
        result = operand1 & operand2;           //   [0000 0001] - Bin
        c = a && b;

        System.out.println(
                operand1 + " & " + operand2 + " = " + result + " (AND)\n" +
                        "c = " + c
        );

        /*
         Диз'юнкція (OR) ||
         Якщо хоч один операнд має значення 1 - вся конструкція буде мати значення 1. Інакше 0.

         0 | 0 = 0         0 | 1 = 1
         1 | 0 = 1         1 | 1 = 1
         */

        operand1 = 2;                           //   [0000 0010] - Bin
        operand2 = 1;                           //   [0000 0001] - Bin
        result = operand1 | operand2;           //   [0000 0011] - Bin
        c = a || b;

        System.out.println(
                operand1 + " | " + operand2 + " = " + result + " (OR)\n" +
                "c = " + c
        );

        /*
         Сувора диз'юнкція (XOR) ^
         Якщо операнди мають однакові значення - результат операції буде 0.
         Якщо різні 1.
         */

        operand1 = 3;                           //   [0000 0011] - Bin
        operand2 = 1;                           //   [0000 0001] - Bin
        result = operand1 ^ operand2;           //   [0000 0010] - Bin
        c = a ^ b;

        System.out.println(
                operand1 + " ^ " + operand2 + " = " + result + " (XOR)\n" +
                        "c = " + c);

        // Заперечення (NOT) ~

        operand1 = 1;                           //   [0000 0001] - Bin
        result = ~operand1;                     //   [1111 1110] - Bin

        System.out.println("~" + operand1 + " = " + result + " (NOT)");

        // Change symbol add 1 to negation of a number.

        operand1 = -100;                         //   [0000 0001] - Bin
        result = ~operand1;                     //   [1111 1110] - Bin
        result++;                               //   [1111 1111] - Bin

//      result = (~operand1) + 1;               //   [1111 1110] + 1 = [1111 1111] - Bin

        System.out.println("Change symbol: " + operand1 + " = " + result);

    }

}
