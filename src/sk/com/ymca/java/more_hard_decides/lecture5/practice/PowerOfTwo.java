package sk.com.ymca.java.more_hard_decides.lecture5.practice;

/*
Відомо, що з чисел, які є ступенем двійки, лише один біт має значення 1.
Використовуючи IntelliJ IDEA, створіть клас PowerOfTwo.
Напишіть програму, яка перевірятиме – чи є вказане число ступенем
двійки чи ні.
 */

import java.util.InputMismatchException;

public class PowerOfTwo {

    public boolean isNumberPowerOfTwo(int number) throws InputMismatchException {
        return (number & number - 1) == 0;
    }
}
