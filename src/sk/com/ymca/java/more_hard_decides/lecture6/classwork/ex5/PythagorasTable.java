package sk.com.ymca.java.more_hard_decides.lecture6.classwork.ex5;
/*
Задача 5: Таблиця Піфагора
Опис задачі: Напишіть програму, яка виведе таблицю Піфагора (таблиця множення)
для чисел від 1 до 10.
Рішення:
Використовуємо вкладені цикли for.
Зовнішній цикл відповідає за перший множник, а внутрішній за другий множник.
 */

public class PythagorasTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
