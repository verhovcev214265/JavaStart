package sk.com.ymca.java.start.lecture8.practice.task2;

public class Brackets {

    static void showBrackets(int number){


        System.out.print("(");

        if (number > 1){
            showBrackets(--number);
        }

        System.out.print(")");
    }

    public static void main(String[] args) {

        showBrackets(4);
    }
}
