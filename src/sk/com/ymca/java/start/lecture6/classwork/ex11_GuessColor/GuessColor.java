package sk.com.ymca.java.start.lecture6.classwork.ex11_GuessColor;

import java.util.Scanner;

public class GuessColor {
    public static void main(String[] args) {

        System.out.println("Guess the intended color in five attempts \nIf you like to go out enter exit");

        final int MAX_ATTEMPT = 5;
        int attempt = 0;
        String color = "red";

        Scanner sc = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT){
            attempt++;
            System.out.println("Attempt " + attempt + ":");
            String value = sc.next();

            if (value.equals("exit")){
                System.out.println("Bye - bye");
                break;
            }else if (!value.equals(color)){
                continue;
            }

            System.out.println("You are win for " + attempt + " attempt.\nGame over!");
            break;
        }

        sc.close();
    }

}
