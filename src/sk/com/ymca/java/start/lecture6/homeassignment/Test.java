package sk.com.ymca.java.start.lecture6.homeassignment;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a ,b;
        Scanner scan = new Scanner(System.in);

        System.out.println("print first number");
        a = scan.nextInt();
        System.out.println("print second number");
        b = scan.nextInt();

        while (a < b) {
            a++;
            System.out.println("your number " + a);

        }
    }
}
