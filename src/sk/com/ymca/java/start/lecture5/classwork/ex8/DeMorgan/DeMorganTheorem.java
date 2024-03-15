package sk.com.ymca.java.start.lecture5.classwork.ex8.DeMorgan;

public class DeMorganTheorem {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        // Умова до застосування теореми Де Моргана
        if (!a || !b){
            System.out.println("!A || !B = " + (!a || !b));
        }else {
            System.out.println("!A || !B = " + (!a || !b));
        }

        if (!(a && b)){
            System.out.println("!(A && B) = " + !(a && b));
        }else {
            System.out.println("!(A && B) = " + !(a && b));
        }
    }
}
