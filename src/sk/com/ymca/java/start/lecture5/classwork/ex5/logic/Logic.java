package sk.com.ymca.java.start.lecture5.classwork.ex5.logic;

public class Logic {
    public static void main(String[] args) {

        boolean operand1 = false;
        boolean operand2 = false;
        boolean result = false;

        // Кон'юнкція
        operand1 = true;
        operand2 = false;
        result = operand1 && operand2;

        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        // Диз'юнкція
        operand1 = true;
        operand2 = false;
        result = operand1 || operand2;

        System.out.println(operand1 + " OR " + operand2 + " = " + result);

        // XOR
        operand1 = true;
        operand2 = true;
        result = operand1 ^ operand2;

        System.out.println(operand1 + " XOR " + operand2 + " = " + result);

        // NOT
        operand1 = true;
        result = !operand1;
        System.out.println("NOT " + operand1 + " = " + result);

    }
}
