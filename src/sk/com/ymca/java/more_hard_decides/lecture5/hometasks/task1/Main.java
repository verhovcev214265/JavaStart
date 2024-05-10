package sk.com.ymca.java.more_hard_decides.lecture5.hometasks.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Parity.class);

    public static void main(String[] args) {

        Parity parity = new Parity();

        try(Scanner sc = new Scanner(System.in)){
            boolean exit = false;
            int chooseMethod;
            while (!exit){
                logger.info("\nThe first method press '1' \n" +
                        "The second method press '2'\n" +
                        "Exit press another number.");
                chooseMethod = sc.nextInt();

                if (chooseMethod != 1 && chooseMethod != 2){
                    exit = true;
                    logger.info("Bye - bye");
                }else {
                    logger.info("Enter your number:");
                    int number = sc.nextInt();
                    switch (chooseMethod){
                        case 1:
                            parity.isPairA(number);
                            break;
                        case 2:
                            boolean answer = parity.isPairB(number);
                            logger.info(
                                    "\nIs your number " + number + " parity?\n" +
                                            "Answer: " + answer + "."
                            );
                    }
                }
            }
        }catch (InputMismatchException e){
            logger.error("You shod choose just numbers!");
        }
    }
}
