package sk.com.ymca.java.more_hard_decides.lecture6.classwork.ex3;

/*
Задача 3: Піраміда з чисел
Опис задачі: Напишіть програму, яка виведе піраміду з чисел.
Кількість рядків: 5. Кожен рядок містить відповідне число, повторене кілька разів.
Рішення:
Використовуємо вкладений цикл for.
Зовнішній цикл відповідає за рядки, а внутрішній за виведення чисел у рядку.
java
 */

public class Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
