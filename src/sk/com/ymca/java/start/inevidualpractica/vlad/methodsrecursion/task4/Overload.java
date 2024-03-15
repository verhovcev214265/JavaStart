package sk.com.ymca.java.start.inevidualpractica.vlad.methodsrecursion.task4;

import java.util.Scanner;

public class Overload {
    static int maxValue (int a, int b){
        int max;
        return (a > b) ? a : b ;
    }
    static int maxValue (int a, int b, int c){
        return (maxValue(a, b) > c) ?  maxValue(a , b) : c;
    }
    static int maxValue (int a, int b, int c, int d){
        return (maxValue(a, b, c) > d) ?  maxValue(a , b , c) : d;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int number4 = scan.nextInt();

        maxValue(number1, number2);
        maxValue(number1, number2,number3);

        int result = maxValue(number1, number2);
        int result1 = maxValue(number1, number2, number3);
        int result2 = maxValue(number1, number2, number3, number4);

        System.out.println(" max number " + result2);

    }
}
