package sk.com.ymca.java.start.lecture4.classwork.ex7_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int a = 1;
        double b = 0.0;
        int max;

        // Вирази мають буди одного типу, для цього використовуємо casting

        max = (int) ((a > b) ? a : b);   // first variant

        max = (a > b) ? a : (int) b;     // second variant

        System.out.println(max);

    }
}
