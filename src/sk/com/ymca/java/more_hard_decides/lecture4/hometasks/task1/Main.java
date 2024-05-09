package sk.com.ymca.java.more_hard_decides.lecture4.hometasks.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Interval.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        Interval interval;

        while (!exit) {
            System.out.println("Start program press any button\n" +
                    "exit press 'q'");
            String choose = sc.next();
            if (choose.equals("q")) {
                System.out.println("bye - bye");
                exit = true;
            } else {
                try {
                    interval = new Interval();
                    System.out.println("Enter number:");
                    int input = sc.nextInt();
                    System.out.println(interval.range(input));
                } catch (NumberFormatException | InputMismatchException e) {
                    logger.error("You must enter only integers numbers!");
                }
            }
        }

        sc.close();
    }
}
