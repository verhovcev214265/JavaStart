package sk.com.ymca.java.start.lecture6.classwork.ex2_DoWhile;

public class DoWhile {
    public static void main(String[] args) {

        int counter = 0;

        do {
            counter++;
            System.out.println("counter = " + counter);
        } while (counter > 3);

        System.out.println("The loop has done " + counter + " iterations.");
    }
}
