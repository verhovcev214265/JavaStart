package sk.com.ymca.java.start.lecture6.homeassignment.task3;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        System.out.println("Enter numbers of clients:");
        Scanner sc = new Scanner(System.in);

        int clients = sc.nextInt();
        int numbersOfOptions = 1;
        do{
            numbersOfOptions *= clients--;

        }while (clients > 0);

        System.out.println("Numbers of options = " + numbersOfOptions);
    }
}
