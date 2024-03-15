package sk.com.ymca.java.start.lecture6.classwork.ex3_Factorial;

public class Factorial {
    public static void main(String[] args) {

        int counter = 4;
        int factorial = 1;

        System.out.println("Number of factorial: " + counter + "! =");

        do {
            // First one multiplication then decrement
            factorial *= counter--;

//          factorial = factorial * counter;
//          counter = counter - 1;
        }while (counter > 0);

        System.out.println(factorial);
    }
}
