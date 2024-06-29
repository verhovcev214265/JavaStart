package sk.com.ymca.java.start.lecture6.classwork.ex6_WhileBreak;

public class WhileBreak {
    public static void main(String[] args) {
        // Циклічна конструкція "while" (з достроковим виходом з циклу "break" )

        int counter = 0;
        while (true){
            System.out.println(counter + " iteration");
            counter++;

            if (counter == 4) break;
        }
    }
}
