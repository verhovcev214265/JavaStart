package sk.com.ymca.java.more_hard_decides.lecture6.classwork.ex2;

/*
Задача 2: Прямокутник із зірочок
Опис задачі: Напишіть програму, яка виведе прямокутник з зірочок (*).
Розміри прямокутника: 5 рядків і 10 колонок.

Рішення:
Використовуємо вкладений цикл for для виведення зірочок.
Зовнішній цикл відповідає за рядки, а внутрішній за колонки.
 */

public class RectangleStars {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
