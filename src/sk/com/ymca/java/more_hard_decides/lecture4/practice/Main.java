package sk.com.ymca.java.more_hard_decides.lecture4.practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Translator translator = new Translator();
        Scanner sc = new Scanner(System.in);
        String input;

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter you word:\n" + "exit press 'q' ");
            input = sc.next().toLowerCase();

            if (input.equals("q")) {
                exit = true;
                System.out.println("bye - bye!");
            } else {
                System.out.println(translator.translate(input));
            }
        }

        sc.close();
    }
}
