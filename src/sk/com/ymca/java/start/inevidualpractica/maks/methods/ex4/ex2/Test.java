package sk.com.ymca.java.start.inevidualpractica.maks.methods.ex4.ex2;

public class Test {

    static double sum(double operand1, double operand2){
        return operand1 + operand2;
    }

    static void sub(double operand1, double operand2){
        System.out.println(operand1 - operand2);
    }

    public static void main(String[] args) {

        double result = sum(5.0, 2.7);
        System.out.println(result);
    }
}
