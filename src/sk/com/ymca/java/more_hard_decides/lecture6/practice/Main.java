package sk.com.ymca.java.more_hard_decides.lecture6.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(SumMin.class);

    public static void main(String[] args) throws InvalidOperationException {
        SumMin sumMin = new SumMin();
        boolean exit = false;

        try (Scanner sc = new Scanner(System.in)) {
            while (!exit) {
                logger.info("Choose the operation:\n" +
                        "Determine the sum - press 1\n" +
                        "Determine the odd - numbers 2\n" +
                        "Exit press 0 ");
                int input = sc.nextInt();
                if (input > 2) throw new InvalidOperationException("Incorrect choose, please choose (1, 2 or 0)");
                try {
                    switch (input) {
                        case 1:
                            logger.info("Enter the first number:");
                            int firstNumber = sc.nextInt();
                            logger.info("Enter the second number:");
                            int secondNumber = sc.nextInt();

                            if (firstNumber < secondNumber) {
                                int answer = sumMin.sum(firstNumber, secondNumber);
                                logger.info("sum = " + answer);
                            } else logger.info("The first number mustn't be bigger than the second number");

                            break;
                        case 2:
                            logger.info("Enter the first number:");
                            int firstOperand = sc.nextInt();
                            logger.info("Enter the second number:");
                            int secondOperand = sc.nextInt();

                            logger.info("Odd numbers: " + sumMin.odd(firstOperand, secondOperand));
                            break;
                        default:
                            logger.info("Bye - bye.");
                            exit = true;
                    }
                } catch (IllegalArgumentException e) {
                    logger.error("Incorrect symbol.\n" + "Please enter only NUMBERS!");
                }
            }
        } catch (InvalidOperationException e) {
            logger.error(e.getMessage());
        } catch (InputMismatchException e) {
            logger.error("Incorrect symbol.\n" + "Please enter only NUMBERS!");
        }
    }
}