package sk.com.ymca.java.start.lecture3.classwork.ex10Input;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Input {

    // Об'єкт класу сканер дозволяє оброблювати ввід даних з консолі

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int inputInt = sc.nextInt();

        System.out.println("Enter your factorial number:");
        float inputFloat = sc.nextFloat();

        System.out.println("Enter your string without spaces:");
        String inputWithoutSpaces = sc.next();

        sc = new Scanner(System.in);

        System.out.println("Enter your string with spaces:");
        String inputWithSpaces = sc.nextLine();

        System.out.println(
                inputInt + "\n" + inputFloat + "\n" + inputWithoutSpaces +
                        "\n" + inputWithSpaces
        );
    }
}
