package sk.com.ymca.java.start.test.ex2;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.Scanner;

public class Translator {
    public static String answer;
    public static String translation(String word, String continuum){ // your method must do just one action, delete 'continuum'
        String ans = null; // change name
        Scanner sc = new Scanner(System.in); // class Scanner mustn't be here!
        String YELLOW = "\u001B[33m"; // take this objects from your interface 
        String RESET = "\u001B[0m";

        switch (word) {
            case "сонячно":
                ans = "Sunny";
                answer = sc.next().toLowerCase();
                break;
            case "дощ":
                ans = "Rain";
                answer = sc.next().toLowerCase();
                break;
            case "сніг":
                ans = "Snow";
                answer = sc.next().toLowerCase();
                break;
            case "хмарно":
                ans = "Cloudy";
                answer = sc.next().toLowerCase();
                break;
            case "вітряно":
                ans = "Windy";
                answer = sc.next().toLowerCase();
                break;
            case "гроза":
                ans = "Thunderstorm";
                answer = sc.next().toLowerCase();
                break;
            case "торнадо":
                ans = "Tornado";
                answer = sc.next().toLowerCase();
                break;
            case "ураган":
                ans = "Hurricane";
                answer = sc.next().toLowerCase();
                break;
            case "туман":
                ans = "Fog";
                answer = sc.next().toLowerCase();
                break;
            case "злива":
                ans = "Downpour";
                answer = sc.next().toLowerCase();
                break;
            default:
                System.out.print("Такого слова немає в нашому словнику\n" + continuum);
                answer = sc.next().toLowerCase();
        }
        return word + " перекладаеться як " + ITaskConstants.IColors.YELLOW +
                ans + ITaskConstants.IColors.RESET + "\n" + continuum;
    }
}