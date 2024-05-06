package sk.com.ymca.java.more_hard_decides.lecture4.hometasks.task1;

/*
Напишіть програму визначення, чи попадає вказане користувачем число від 0 до 100 у числовій
проміжок [0 – 14] [15 – 35] [36 – 50] [50 – 100]. Якщо так, то вкажіть, який саме проміжок. Якщо
користувач вказує число, що не входить до жодного з наявних числових проміжків, то
виводиться відповідне повідомлення.
 */

import java.util.InputMismatchException;

public class Interval {
    public String range(int number) throws NumberFormatException, InputMismatchException {
        String answer = null;

        if (number >= 0 && number <= 14) {
            answer = "Your number in range from 0 till 14";
        } else if (number >= 15 && number <= 35) {
            answer = "Your number in range from 15 till 35";
        } else if (number >= 36 && number <= 50) {
            answer = "Your number in range from 36 till 50";
        } else if (number >= 50 && number <= 1001) {
            answer = "Your number in range from 50 till 100";
        } else {
            answer = "Your number isn't in any range.";
        }
        return answer;
    }
}
