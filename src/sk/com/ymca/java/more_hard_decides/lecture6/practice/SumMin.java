package sk.com.ymca.java.more_hard_decides.lecture6.practice;

/*
Використовуючи IntelliJ IDEA, створіть клас SumMin.
Дано два числа A та B (A<B) виведіть суму всіх чисел, розташованих між цими числами на екран.
———————————————————————————————————
Дано два числа A та B (A<B) виведіть усі непарні значення, розташовані між даними числами
 */

import java.util.ArrayList;

public class SumMin {

    private final ArrayList<Integer> oddNumbers = new ArrayList<>();

    public SumMin(){}

    public int sum (int numberA, int numberB) throws IllegalArgumentException{
        int result = 0;

        for (int i = (numberA + 1); i < numberB; i++) {
            result += i;
        }
        return result;
    }

    public ArrayList<Integer> odd (int numberA, int numberB) throws IllegalArgumentException{
        oddNumbers.clear();

        for (int i = ++numberA; i < numberB; i++) {
            if (i % 2 != 0) oddNumbers.add(i);
        }
        return oddNumbers;
    }
}
