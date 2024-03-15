package sk.com.ymca.java.start.inevidualpractica.maks.methods.ex4.ex1;

import java.util.Scanner;

public class NumbersOfCheck {
    static String parity (int number) {

        // Немає перевірки на позитивне чи негативне число

        if (number % 2 == 0) {                // це перевірка на те чи є число парним або не парним, по умові вона взагалі не потрібна
            return number + " is paired";
        } else if (number % 2 == 1) {
            return number + " isn't paired";
        } else {
            return "You entered something wrong";
        }
    }

    /*
    (За бажанням) спробуй переробити метод так щоб він повертав boolean.
    Тобто якщо число просте повертається true якщо ні  falce.
     */
    static String primeNumber (int number) {
        String result = "";

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {                   // Подумай як скоротити кількість ітерацій
                result = number + " isn't prime";
                break;
            } else {
                result = number + " is prime";
                continue;                             // цей оператур тут зайий
            }
        }
        return result;
    }

    static void division (int number) {
        if (number % 2 == 0) {
            System.out.println("This number is evenly divisible by 2");
        }
        if (number % 5 == 0) {
            System.out.println("This number is evenly divisible by 5");
        }
        if (number % 3 == 0) {
            System.out.println("This number is evenly divisible by 3");
        }
        if (number % 6 == 0) {
            System.out.println("This number is evenly divisible by 6");
        }
        if (number % 9 == 0) {
            System.out.println("This number is evenly divisible by 9");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        /*
        Макс по умові це все має бути в одному методі не в двох.
        Але мене особисто дуже радує що ти їх розділив бо на практиці так і роблять 1- ин метод робить лише щось одне.
         */
        String result1 = parity(number);
        String result2 = primeNumber(number);

        System.out.println(result1 + "\n" + result2);

        division(number);

        scan.close();
    }
}
