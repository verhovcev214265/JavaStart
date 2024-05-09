package sk.com.ymca.java.start.lecture5.classwork.ex4.cyper;

public class Encryption {
    /*
        Використовуючи XOR, ми можемо зашифрувати повідомдення.
        В такому виді шифрування використовується один ключ, як для шифрування так і для розшифровки.
        Криптостійкість такого ключа, можно збільшити, якщо збільшити його довжину.
    */
    public static void main(String[] args) {
        short secretKey = 0b0101;  // Secret key (5 dec)
        char character = 'A';      // Вихідний символ для шифрування.

        System.out.println(
                "Вихідний символ: " + character + ", його код у кодовій таблиці: " +
                        (byte) character)
        ;

        // Зашифровуємо символ. character = 0100 0001 (65)
        character = (char) (character ^ secretKey); // 0100 0001 ^ 0000 0101 = 0100 0100
        System.out.println(
                "Зашифрований символ: " + character + ", його код у кодовій таблиці: " +
                        (byte) character
        );

        // Розшифровуємо символ. character = 0100 0100 (68)
        character = (char) (character ^ secretKey); // 0100 0100 ^ 0000 0101 = 0000 0101
        System.out.println("Розшифрований символ: " + character +
                ", його код у кодовій таблиці: " + (byte) character
        );

    }
}
