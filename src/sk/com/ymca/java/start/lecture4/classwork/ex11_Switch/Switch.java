package sk.com.ymca.java.start.lecture4.classwork.ex11_Switch;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a or b, ONLY! ");

        final String a = "10";
        final String b = "20";

        String input = scan.next();

        /*
         Створюємо конструкцію багатозначного вибору, перемикач switch, якому в якості селекторного-виразу передаємо
         змінну input.
         */

        switch (input){
            /*
            В тілі перемикача створбємо 2-а оператора (case) з постійними виразами (a та b)
            Якщо значення селекторного-виразу (в даному випадку input) співпаде з постійним виразом одного з (case)
            тоді виконується дія в тілі цього (case-у)
             */
            case "a": {
                System.out.println("Your letter is: a");
                break;
            }
            case "b": {
                System.out.println("Your letter is: b");
                break;
            }

            case a:{
                System.out.println(a);
                break;
            }
            case b:{
                System.out.println(b);
                break;
            }
            // В будь-якому іншому випадку відпрацює блок default (блок default не є обов'язковим)
            default: {
                System.out.println("You entered: " + ITaskConstants.IColors.RED + "incorrect symbol!");
            }
        }
        // Порівнюємо з блоком if...else
//        if (input.equals("a")){
//            System.out.println("Your letter is: a");
//        }else if (input.equals("b")){
//            System.out.println("Your letter is: b");
//        }else {
//            System.out.println("You entered: " + ITaskConstants.IColors.RED + "incorrect symbol!");
//        }
    }
}
