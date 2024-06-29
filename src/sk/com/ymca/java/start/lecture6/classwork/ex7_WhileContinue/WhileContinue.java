package sk.com.ymca.java.start.lecture6.classwork.ex7_WhileContinue;

public class WhileContinue {
    public static void main(String[] args) {

        int counter = 0;
        while (true) {
            counter++;
            if (counter == 3) continue;
            System.out.println(counter + " - iteration");

            if (counter == 5) break;
        }
    }
}
