package sk.com.ymca.java.start.lecture7.classwork.ex10;

import java.util.Scanner;

public class Parse {
    static int addTwo(int a) {
        a = a + 2;
        System.out.println("Значение int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);

        // Принимаем ввод от пользователя и преобразуем его в целочисленное значение

        String number = sc.next();
        int input = Integer.parseInt(number);

        System.out.println("Значение input = " + input);
        input = 10;
        // В качестве аргумента передается не сама переменная - input, а её копия.
        input = addTwo(input);
        System.out.println(addTwo(input));
        System.out.println(input);
    }
}
