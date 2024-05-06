package sk.com.ymca.java.start.lecture4.classwork;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to use this program? 1 - 'Yes' 2 - 'No'");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("Enter ukrainian word");
                String word = scan.next().toLowerCase();

                switch (word) {
                    case "книга": {
                        System.out.println("book");
                        break;
                    }
                    case "чашка": {
                        System.out.println("cup");
                        break;
                    }
                    case "коробка": {
                        System.out.println("box");
                        break;
                    }
                    case "куртка": {
                        System.out.println("jacket");
                        break;
                    }
                    case "серце": {
                        System.out.println("heart");
                        break;
                    }
                    case "крапка": {
                        System.out.println("dot");
                        break;
                    }
                    case "стілець": {
                        System.out.println("chair");
                        break;
                    }
                    case "літера": {
                        System.out.println("letter");
                        break;
                    }
                    case "сніданок": {
                        System.out.println("breakfast");
                        break;
                    }
                    case "вікно": {
                        System.out.println("window");
                        break;
                    }
                    default: {
                        System.out.println("i don`t know this word");
                    }
                }

            } else if (choice == 2) {
                break;
            }
        }
    }
}
