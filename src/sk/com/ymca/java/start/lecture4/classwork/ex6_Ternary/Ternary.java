package sk.com.ymca.java.start.lecture4.classwork.ex6_Ternary;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        String whoIs = "Hello ";

        System.out.println("Enter your login:");

        Scanner scan = new Scanner(System.in);
        String login = scan.next();

        // додаємо і присвоюємо повертаюче значення тернарного оператора
        whoIs += login.equals("Admin") ? "Administrator" : "User";

        System.out.println(whoIs);

    }
}
