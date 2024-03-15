package sk.com.ymca.java.start.inevidualpractica.maks.methods_with_recursion.task1;

import java.util.Scanner;

 /*
    Тут трошки заморочився за що тебе хвалю, але саме по цій умові треба зробити на багато простіше:
    1) Метод має приймати лише один параметр (суму платежу);
    2) Рекурсію не використовуй в цій задачі;
    3) Суму кредиту задай сам в якусь змінну "руками" (без Scanner);
    4) По умові щомісячна сума має становити 100 грн (більше можно, менше ні) зроби перевірку на це;
    5) Ну і далі по умові:
       - метод виводить на екран інформацію про стан кредиту сума заборгованості (якщо кредит не погашено);
       - повідомлення про відсутність боргу (якщо сума кредиту дорівнює платежу)
       - повідомлення про відсутність боргу та сума переплати (якщо сума платежу більша за суму кредиту).
     */

public class Bank {


    static  void payments(int debt, int counter, int startDebt) {
        ++counter;

        if (counter <= 7 && debt <= startDebt) {
            System.out.println("Payment:");
            Scanner scanner = new Scanner(System.in);
            int payment = scanner.nextInt();

            debt = debt - payment;

            if (debt > 0) payments(debt, counter, startDebt);
            else if (debt == 0) System.out.println("You paid all your debt");
            else System.out.println("You paid more your debt");
        }else {
            System.out.println("You didn't pay on time");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the amount of money you want to borrow:");
        Scanner scan = new Scanner(System.in);
        int debt = scan.nextInt();

        int startDebt = debt;

        int counter = 0;

        System.out.println("Attention! You must repay the entire debt in a maximum of 7 payments");

        payments(debt, counter, startDebt);
    }
}
