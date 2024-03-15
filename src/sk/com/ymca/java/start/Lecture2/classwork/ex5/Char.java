package sk.com.ymca.java.start.Lecture2.classwork.ex5;

public class Char {
    public static void main(String[] args) {

        char a = 'a';              // символ
        char b = 0x0041;           // значення у 16-річному форматі
        char c = '\u004F';         // значення у форматі Unicode
        char d = '\u0041';         // значення у форматі Unicode
        char q = '\u004C';

        char dollar = '\u0024';

        System.out.println(a + "\n" + b + "\n" + d + "\n" + c + "\n" + dollar + "\n" + q);
    }
}
