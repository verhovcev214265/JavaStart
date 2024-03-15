package sk.com.ymca.java.start.lecture7.classwork.ex5;

import java.util.Scanner;

public class Sum {

    static int add(int argument1, int argument2){
        return argument1 + argument2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter argument1:");
        int arg1 = sc.nextInt();

        System.out.println("Enter argument2:");
        int arg2 = sc.nextInt();

        int result = add(arg1, arg2);
        System.out.println(arg1 + " + " + arg2 + " = " + result);

    }
}
