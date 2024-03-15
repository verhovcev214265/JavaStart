package sk.com.ymca.java.start.lecture3.classwork.ex2Casting;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Casting {
    public static void main(String[] args) {

        // Неявне перетворення (implict) БЕЗПЕЧНЕ (з меншого типа в більший)

        byte a = 10;   //                               0000 1010 - 1_byte
        int b = 0;     // 0000 0000 0000 0000 0000 0000 0000 0000 - 4_bytes
        b = 0;         // 0000 0000 0000 0000 0000 0000 0000 1010 - 4_bytes
        b = a;

        System.out.println("Implict 'byte to int' = " + b + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Неявне перетворення цілого типа в дробовий тип.

        int c = 255;
        float d = 0f;
        d = c;
        System.out.println("Implict 'int to float' = " + d + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Явне перетворення (implict) НЕБЕЗПЕЧНЕ (з більшого типу в менший)

        int e = 209;    // 0000 0000 0000 0000 0000 0000 1000 0000 - 4_bytes
        byte f = 0;     //                               0000 0000 - 1_byte
        f = (byte) e;   //                               0000 000v1 - 1_byte
        System.out.println("Expict 'int to byte' = " + f + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        float g = 9.05f;
        int h = 0;
        h = (int) g;
        System.out.println("Implict 'int to float' = " + h + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // * Хочаб одне число має бути з дробовою частиною!!!

        float i = 3/5.0f;
        float j = 3.5f/5;
        System.out.println("i = " + i + ITaskConstants.NEW_LINE + "j = " + j + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        float k = 9/5;
        System.out.println("k = " + k + ". When variable doesn't have factorial number." +
                ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Ми можемо неявно перетворити константу типу int в тип byte, але за умови якщо значення
        // константи не перевищує діапазон максимально допустимого значення.

        final int l = 127;
        byte m = 0;
        m = l;
        System.out.println("m = " + m + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Явне перетворення з константи відбувається таким самим чином як і зі змінною, з втратою частини даних.

        final int n = 259;
        byte o = 0;
        o = (byte) n;
        System.out.println("o = " + o + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // При перетвворині дробового типу (float, double) y цілочисловий тип (byte, int e.t.c) дробова частина не враховується

        final float p = 128.5f;
        byte q = 0;
        q = (byte) p;
        System.out.println("q = " + q + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

    }
}
