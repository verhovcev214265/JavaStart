package sk.com.ymca.java.start.test.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String word;
        final String continuum = "Перекласти ще одне слово? (Так/Ні) ";
        
        while (!exit) {
            System.out.print("Введить слово: ");
            word = sc.next().toLowerCase();

            System.out.println(Translator.translation(word, continuum));

            switch (Translator.answer) {
                case "так":
                    continue;
                case "ні":
                    exit = true;
                    break;
            }
        }
    }
}