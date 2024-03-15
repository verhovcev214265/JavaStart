package sk.com.ymca.java.start.test.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Manipulation manipulation = new Manipulation();
//
//        manipulation.sayHello();
//        System.out.println(Arrays.toString(manipulation.showName(10, "Bob")));

        boolean ivenNumber;

        System.out.println("Enter your number:");
        try (Scanner sc = new Scanner(System.in)){

            int input = sc.nextInt();
            ivenNumber = input % 2 == 0;
        }
        System.out.println("ivenNumber = " + ivenNumber);
    }
}

