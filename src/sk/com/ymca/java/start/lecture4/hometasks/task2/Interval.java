package sk.com.ymca.java.start.lecture4.hometasks.task2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose;

        while (!exit){
            System.out.println("Start program press any button\n" +
                    "exit press 'q'");
            choose = sc.next();
            if (choose.equals("q")){
                System.out.println("bye - bye");
                exit = true;
            }else {
                System.out.println("Enter number from 0 to 100");
                int input = sc.nextInt();

                if (input > 0 && input <= 14) {
                    System.out.println("Your number interval = [0 - 14]");
                } else if (input >= 15 && input <= 35) {
                    System.out.println("Your number interval = [15 - 35]");
                } else if (input >= 36 && input <= 50) {
                    System.out.println("Your number interval = [36 - 50]");
                } else if (input >= 50 && input <= 100) {
                    System.out.println("Your number interval = [50 - 100]");
                } else {
                    System.out.println(
                            "your number does not fall into any of the ranges from 0 to 100"
                    );
                }
            }
        }
    }
}
