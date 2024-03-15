package sk.com.ymca.java.start.lecture3.classwork.ex8Assignment;

public class Assignment {
    public static void main(String[] args) {
        /*
        Правило:
        Всі арифметичні операції які виконуються над двома значеннями типів (byte, short)
        в якості результату, повертають значення типу int

        Присвоєння зі складанням для типа byte
         */
        byte var1 = 0;

//         var1 = var1 + 5;   // ПОМИЛКА: Спроба неявного перетворення значення результату, тип int в тип byte.
//         var1 = (byte) var1 + 5; // Перетворення типа byte відбувається раніше ніж додавання результату

        var1 = (byte) (var1 + 5); // Погане рішення, але всеж таки рішення
        var1 += 5;

        /*
        Правило:
        Для типів long, int не потрібно виконувати перетворення типів
         */

        int var2 = 0;
        var2 = var2 + 5;
        var2 += 5;

        long var3 = 0;
        var3 = var3 * 99;
        var3 *= 99;

    }
}
