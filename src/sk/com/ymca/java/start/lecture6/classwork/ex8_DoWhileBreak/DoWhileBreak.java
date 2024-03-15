package sk.com.ymca.java.start.lecture6.classwork.ex8_DoWhileBreak;

public class DoWhileBreak {
    public static void main(String[] args) {

        int counter = 0;
        do {
            counter++;
            System.out.println("Counter = " + counter);

            if (true) break;
            System.out.println("This string shouldn't be print");
        }while (counter < 3);

        System.out.println(counter + " iterations have been done");
    }
}
