package sk.com.ymca.java.start.lecture4.practice;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter word in Ukraine: ");
            String input = sc.next().toLowerCase();

            switch (input){
                case "сонце":
                    System.out.println("Sun");
                    break;
                case "вітер":
                    System.out.println("Wind");
                    break;
                case "дощь":
                    System.out.println("Rain");
                    break;
                case "сніг":
                    System.out.println("Snow");
                    break;
                case "злива":
                    System.out.println("Downpour");
                    break;
                case "ураган":
                    System.out.println("Hurricane");
                    break;
                case "шторм":
                    System.out.println("Storm");
                    break;
                case "землетрус":
                    System.out.println("Earthquake");
                    break;
                case "мороз":
                    System.out.println("Freeze");
                    break;
                case "жара":
                    System.out.println("Hot");
                    break;

                default:
                    System.out.println(
                            ITaskConstants.IColors.RED +
                                    "The word doesn't exist in this dictionary" +
                            ITaskConstants.IColors.RESET
                    );
            }

        }
    }
}
