package sk.com.ymca.java.start.lecture4.classwork.ex3_Authentification;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {

        String login = "Admin";
        String password = "root";

        // Створюємо об'єкт класу Scanner для обробки вводу користувача
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login");
        // Приймаємо ввід користувача
        String userLogin = scan.next();

        if (login.equals(userLogin)){
            System.out.println("Enter your password");
            String userPassword = scan.next();
            if (password.equals(userPassword)){
                System.out.println("Hello " + userLogin + " you entered to the system.");
            }else {
                System.out.println("Incorrect password");
            }
        }else {
            System.out.println("There is no user in this login");
        }
    }
}
