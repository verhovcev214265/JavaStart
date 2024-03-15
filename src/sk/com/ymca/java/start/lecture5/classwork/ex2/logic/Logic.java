package sk.com.ymca.java.start.lecture5.classwork.ex2.logic;

public class Logic {
    public static void main(String[] args) {
        // Кон'юнкція (AND) &&

        byte operand1;
        byte operand2;
        int result;

        operand1  = 127;                        //   [0111 1111] - Bin
        operand2 = 1;                           //   [0000 0001] - Bin
        result = operand1 & operand2;           //   [0000 0001] - Bin

        System.out.println(operand1 + " & " + operand2 + " = " + result + " (AND)");

        // Диз'юнкція (OR) ||

        operand1 = 2;                           //   [0000 0010] - Bin
        operand2 = 1;                           //   [0000 0001] - Bin
        result = operand1 | operand2;           //   [0000 0011] - Bin

        System.out.println(operand1 + " | " + operand2 + " = " + result + " (OR)");

        // Сувора диз'юнкція (XOR) ^

        operand1 = 3;                           //   [0000 0011] - Bin
        operand2 = 1;                           //   [0000 0001] - Bin
        result = operand1 ^ operand2;           //   [0000 0010] - Bin

        System.out.println(operand1 + " ^ " + operand2 + " = " + result + " (XOR)");

        // Заперечення (NOT) ~

        operand1 = 1;                           //   [0000 0001] - Bin
        result = ~operand1;                     //   [1111 1110] - Bin

        System.out.println("~" + operand1 + " = " + result + " (NOT)");

        // Change symbol

        operand1 = 100;                         //   [0000 0001] - Bin
        result = ~operand1;                     //   [1111 1110] - Bin
        result++;                               //   [1111 1111] - Bin

//      result = (~operand1) + 1;               //   [1111 1110] + 1 = [1111 1111] - Bin

        System.out.println("Change symbol: " + operand1 + " = " + result);

    }

}
