package sk.com.ymca.java.start.lecture5.practice.task1;
/*
Відомо, що з чисел, які є ступенем двійки, лише один біт має значення 1.
Використовуючи IntelliJ IDEA, створіть клас PowerOfTwo.
Напишіть програму, яка перевірятиме – чи є вказане число ступенем
двійки чи ні.
 */

import java.util.Scanner;

public class PowerOfTwo_Second {
    public static void main(String[] args) {
        System.out.println("Start program press any button:\n" +
                "exit press q");
        Scanner sc = new Scanner(System.in);
        String action = sc.next();
        boolean exit = false;

        while (!exit){
            if (action.equals("q")){
                System.out.println("Bye - bye");
                exit = true;
            }else {
                System.out.println("Enter your number:");
                int input = sc.nextInt();
                if ((input & input - 1) == 0) System.out.println("Your number is power of two.");
                else System.out.println("Your number is NOT power of two.");
            }
        }
    }
}
