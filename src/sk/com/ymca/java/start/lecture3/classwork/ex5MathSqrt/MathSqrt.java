package sk.com.ymca.java.start.lecture3.classwork.ex5MathSqrt;

// Знаходиться у даному пакеті, який підключається автоматично Джавою.
import static java.lang.Math.pow;

public class MathSqrt {

    // Math.sqrt - математична функція, яка вятягує квадратний корінь з числа
    public static void main(String[] args) {

        double x = 256;
        double result = Math.sqrt(x);
        System.out.println("Квадратний корінь = " + result);

    }

}
