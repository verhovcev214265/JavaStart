package sk.com.ymca.java.start.lecture5.practice.task1;

import java.util.Scanner;

public class PowerOfTwo_First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter your number:" + "\n" + "If you want to go out enter (-1)");
            int input = sc.nextInt();

            if (input != -1) {
                /*
                 128 - 1000 0000
                 &
                 127 - 0111 1111
                 answer = 0000 0000 OK
                 */
                if ((input & input - 1) == 0) {
                    System.out.println("This number is a power of two");
                } else {
                    System.out.println("This number is not a power of two");
                }
            } else {
                exit = true;
                System.out.println("Bye - bye");
            }
        }
        sc.close();
    }
}
