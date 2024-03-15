package sk.com.ymca.java.start.Lecture2.classwork.ex2;

public class BasicTypes {
    public static void main(String[] args) {

                                          // ПРИМІТИВНІ ТИПИ ДАНИХ

        // ЦІЛОЧИСЕЛЬНІ:

        // 8 - bits == 1 - byte, з діапазоном чисел від -128 до +127
        byte a = -128;
        byte b = 127;

        // 16 - bits == 2 - bytes, з діапазоном чисел від -32768 до +32767
        short c = -32768;
        short d = 32767;

        // 32 - bits == 4 - bytes, з діапазоном чисел від -2147483648 до +2147483647
        int e = -2_147_483_648; // більш зручне написання
        int f = 2_147_483_647;

        // 64 - bits == 8 - bytes, з діапазоном чисел від -9223372036854775808 до +9223372036854775807
        long g = -9_223_372_036_854_775_808L; // більш зручне написання
        long h = 9223372036854775807L;


        // ДРОБОВІ:

        // 32 - bits == 4 - bytes
        /*
         Обов'язковово вказуємо суфікс F або f,
         т.як за замовчуванням компілятор інтерпритує його як double
         */
        float i = -2147483647.123456789F;
        float j = 1.1234567f;

        // 64 - bits == 8 - bytes
        double k = -0.123456789123456d;
        double l = 1.123456789123456D;
        double m = 2.123456789123456;

        // ЛОГІЧНИЙ

        // 8 - bits == 1 - byte
        boolean n = true;
        boolean o = false;

        // СИМВОЛЬНИЙ

        // 16 - bits == 2 - bytes, символ у форматі UNICODE
        char p = '1';
        char q = 's';
        char symbol = '\u0024';


        //                        !!!  НЕ ПРИМІТИВНИЙ ТИП  !!!

        //СТРОКОВИЙ який є об'єктом!!! строка у форматі UNICODE

        String myFirstString = "Hello";
        String mySecondString = "WORLD!";


        //                       КЛАСИ ОБГОРТКИ

        float max = Float.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        char bigChar = Character.toUpperCase('d');
        long v = Long.bitCount(212L);

        System.out.println(max + "\n" + min + System.lineSeparator() + bigChar + "\n" + v );

    }

}
