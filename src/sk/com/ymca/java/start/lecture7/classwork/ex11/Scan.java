package sk.com.ymca.java.start.lecture7.classwork.ex11;

import java.util.Scanner;

public class Scan {
    // Параметр, передаваемый по значению, уничтожается при возврате значения методом
    // Чтобы получить изменённый результат используем ключевой слово return

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

        // Присвоим переменной input значение, возвращённое методом addTwo()
        input = addTwo(input);
        System.out.println("Значение input = " + input);
    }
}
