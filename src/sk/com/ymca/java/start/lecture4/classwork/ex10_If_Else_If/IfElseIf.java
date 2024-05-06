package sk.com.ymca.java.start.lecture4.classwork.ex10_If_Else_If;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number: ");
            int input = sc.nextInt();

            if (input == 10) {
                System.out.println("Input = 10");
            } else if (input == 5) {
                System.out.println("Input = 5");
            } else if (input == 7) {
                System.out.println("Input = 7");
            } else {
                System.out.println("Input doesn't equal 5, 7 and 10");
            }
        }
    }
}
