package sk.com.ymca.java.more_hard_decides.lecture5.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(PowerOfTwo.class);

    public static void main(String[] args) {

        PowerOfTwo powerOfTwo = new PowerOfTwo();
        boolean exit = false;

        try (Scanner sc = new Scanner(System.in)) {
            while (!exit) {
                logger.info("Enter your number:\n" +
                        "exit press '-1'.");
                int action = sc.nextInt();
                if (action == -1) {
                    logger.info("Bye - bye");
                    exit = true;
                }else {
                    logger.info(
                            "Is number " + action + " power of two?\n" +
                                    "answer: " + powerOfTwo.isNumberPowerOfTwo(action)
                    );
                }
            }
        } catch (InputMismatchException e) {
            logger.error("You have to enter ONLY numbers!!!");
        }
    }
}
