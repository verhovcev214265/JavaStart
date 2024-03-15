package sk.com.ymca.java.start.lecture8.homework.task2;

import java.util.Scanner;

public class Test {

    // Проблема факториала в том, что мы не можем точно уследить за размером переменной
    // Число может не влезть в int. Нужно использовать больше
    public static int process(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else if (num < 0) {
            return 0;
        } else {
            // Рекурсия
            return num * process(num - 1);
        }
    }

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers of clients:");
        int input = sc.nextInt();

        int resultOptions = process(input);
        System.out.println(resultOptions);

    }
}