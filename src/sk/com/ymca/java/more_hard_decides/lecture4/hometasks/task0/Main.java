package sk.com.ymca.java.more_hard_decides.lecture4.hometasks.task0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean exit = false;
        String input;

        while (!exit) {
            System.out.println("Start program press any button\n" +
                    "exit press 'q'.");
            input = sc.next();
            if (input.equals("q")) {
                System.out.println("bye - bye");
                exit = true;
            } else {
                try {
                    System.out.println("Enter operandA: ");
                    double operandA = sc.nextDouble();
                    System.out.println("Enter arithmetic operation");
                    String operation = sc.next();
                    System.out.println("Enter operandB: ");
                    double operandB = sc.nextDouble();

                    System.out.println(calculator.calculate(operandA, operation, operandB));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        sc.close();
    }
}
