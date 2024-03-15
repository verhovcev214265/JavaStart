package sk.com.ymca.java.start.lecture5.classwork.ex7.shortLogicComputing;

public class ShortLogicComputing {
    public static void main(String[] args) {

        final int MIN_VALUE = 1;
        int denominator = 0;
        int item = 2;

        // If we put just one ampersand we will take Arithmetic exception
        if ((denominator != 0) && (item / denominator) > MIN_VALUE) {
            System.out.println("We are into block 'if'.");
        } else {
            System.out.println("We are into block 'else'.");
        }
    }
}
