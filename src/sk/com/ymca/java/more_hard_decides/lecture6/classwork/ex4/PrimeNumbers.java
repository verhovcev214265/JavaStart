package sk.com.ymca.java.more_hard_decides.lecture6.classwork.ex4;

/*
адача 4: Просте число в діапазоні
Опис задачі: Напишіть програму, яка виведе всі прості числа в діапазоні від 2 до 50.
Рішення:
Використовуємо вкладені цикли for.
Зовнішній цикл перебирає числа в діапазоні, внутрішній перевіряє, чи є число простим.
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
