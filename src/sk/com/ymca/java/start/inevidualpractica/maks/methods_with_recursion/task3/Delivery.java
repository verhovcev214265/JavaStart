package sk.com.ymca.java.start.inevidualpractica.maks.methods_with_recursion.task3;

import java.util.Scanner;

public class Delivery {
    static void factorial(long number, int counter) {
        number *= --counter;

        if (counter > 1){
            factorial(number, counter);
        }else if(counter < 0){
            System.out.println("The number of clients can't be less than zero");
        }else{
            System.out.println("Quantity of options: " + number);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the quantity of clients:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int counter = number;

        if (number == 1) System.out.println("Quantity of options: " + number);
        else if (number > 25) System.out.println("This program can't solve under 25 clients");
        else factorial(number, counter);
    }
}
