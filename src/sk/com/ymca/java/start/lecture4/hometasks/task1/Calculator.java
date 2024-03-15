package sk.com.ymca.java.start.lecture4.hometasks.task1;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double operand1;
        double operand2;
        String sign;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.println("Enter first number:");
            operand1 = sc.nextDouble();
            System.out.println("Enter first number: ");
            operand2 = sc.nextDouble();
            System.out.println("Enter the sign of the arithmetic operation (+), (-), (*), (/):");
            sign = sc.next();

            switch (sign){
                case "+" :
                    System.out.println(operand1 + operand2);
                    break;
                case "-" :
                    System.out.println(operand1 - operand2);
                    break;
                case "*" :
                    System.out.println(operand1 * operand2);
                    break;
                case "/" :
                    if (operand2 != 0){
                        System.out.println(operand1 / operand2);
                    }else {
                        System.out.println(ITaskConstants.IColors.RED + "It is forbidden to divide by 0");
                    }
                    break;

                default:
                    System.out.println(ITaskConstants.IColors.RED + "You enter incorrect symbol!" +
                            ITaskConstants.IColors.RESET);

            }

        }
    }
}
