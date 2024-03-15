package sk.com.ymca.java.start.inevidualpractica.vlad.methodsrecursion.task1;

/*
Використовуючи IntelliJ IDEA, створіть клас Bank.
Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити, чи погасив клієнт
кредит чи ні. Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт повинен
виконати 7 платежів, але може платити рідше за великі суми. Тобто може двома платежами по 300
та 400 грн. Закрити весь обов'язок.
Створіть метод, який як аргумент прийматиме суму платежу, введену економістом
банку. Метод виводить на екран інформацію про стан кредиту (сума заборгованості, сума
переплати, повідомлення про відсутність боргу).
 */

import java.util.Scanner;

public class Bank {
    static void main(int payment) {

        int dept = 700;
        int overpayment;
        int arrears;

        System.out.print("Your arrears = 700 " + "\n" + "Your payment = " + payment);

        if (payment < 100) {
            System.out.println("The amount must be at least 100");
        } else {
            if (payment > dept) {
                overpayment = payment - dept;
                System.out.println("loan paid off" + "\n" + "overpayment:" + overpayment);

            } else if (payment == dept) {
                System.out.println("loan paid off");
            } else {
                arrears = dept - payment;
                System.out.print("\nremainder = " + arrears);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the amount of money");
        int suma = scan.nextInt();

        main(suma);
        scan.close();
    }
}
