package sk.com.ymca.java.start.lecture8.homework.task2;

import java.util.Scanner;

public class Delivery {

    static int numberOfOptions (int clients){

        if (clients == 0 || clients < 0){
            return 0;
        } else if (clients == 1) {
            return 1;
        }else {
            return clients * numberOfOptions(clients - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers of clients:");
        int input = sc.nextInt();

        int resultOptions = numberOfOptions(input);
        System.out.println(resultOptions);

    }
}
