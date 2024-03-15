package sk.com.ymca.java.start.lecture8.classwork.ex8;

public class Converter {

    static void converter(int n){
        int temp = n % 2;

        if (n >= 2) converter(n / 2);

        System.out.print(temp);
    }

    public static void main(String[] args) {

        converter(14);
    }
}
