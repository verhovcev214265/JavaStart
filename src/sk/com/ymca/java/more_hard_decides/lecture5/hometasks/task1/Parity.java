package sk.com.ymca.java.more_hard_decides.lecture5.hometasks.task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;

/*
Відомо, що у парних чисел молодший біт має значення 0
Використовуючи IntelliJ IDEA, створіть клас Parity.
Напишіть програму, яка виконуватиме перевірку чисел на парність.
Запропонуйте два варіанти вирішення поставленого завдання.
 */

public class Parity {

    private static final Logger logger = LoggerFactory.getLogger(Parity.class);

    public void isPairA (int number) throws InputMismatchException {
        if (number % 2 == 0) logger.info("Number: " + number + " is even.");
        else logger.info("Number: " + number + " is NOT even.");
    }

    public boolean isPairB (int number) throws InputMismatchException{
        return ((number & 1) == 0);
    }
}
