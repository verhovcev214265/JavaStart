package sk.com.ymca.java.start.inevidualpractica.vlad.methodsrecursion.task3;

import java.util.Scanner;

public class Main {
    static void number (int n){
        if (n >= 1) {
            n--;
            System.out.print(n + 1 + ", ");
            number(n);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        number(n);
    }
}
