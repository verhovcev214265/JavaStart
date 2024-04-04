package sk.com.ymca.java.me.lecture3.task1;

/*
Є 3 змінні типу int x = 10, y = 12 і z = 3;
Виконайте та розрахуйте результат наступних арифметичних операцій для цих змінних:
 x += y - x++ * z;
 z = --x - y * 5;
 y /= x + 5% z;
 z = x++ + y * 5;
 x = y - x++ * z;
 */

public class Main {
    public static void main(String[] args) {

        int x = 10, y = 12, z = 3;

        x += y - x++ * z;
        System.out.println("x = " + x);

        z = --x - y * 5;
        System.out.println("z = " + z);

        y /= x + 5% z;
        System.out.println("y = " + y);

        z = x++ + y * 5;
        System.out.println("z = " + z);

        x = y - x++ * z;
        System.out.println("x = " + x);

    }
}
