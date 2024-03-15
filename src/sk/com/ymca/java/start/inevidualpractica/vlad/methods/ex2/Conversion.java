package sk.com.ymca.java.start.inevidualpractica.vlad.methods.ex2;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        /*
         В умові сказано що користувач вводить суму грошей і курс конвертації тобто змінні маєш ініціалізувати не ти
         а користувач
         */
        double cursEuro = 40.42;
        double cursHRN = 0.025;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter '0' euro in hrivny/enter '1' hrivny in euro " );
        byte in = scan.nextByte();

        System.out.println("enter the amount money");

        if(in == 0){
            double hrivny = scan.nextFloat();

            double euro = hrivny * cursEuro;
            System.out.println(euro);}else { // код дуже погано читається не забувай про (Ctrl+Alt+L)

            double euro = scan.nextFloat();

            double hrivny = euro * cursHRN;
            System.out.println(hrivny);

            // Не закрив потік даних " scan.close() "

        }
    }
}
