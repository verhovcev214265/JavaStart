package sk.com.ymca.java.start.lecture6.classwork.ex6_WhileBreak;

public class WhileBreak2 {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 3){
            counter++;
            System.out.println("Counter = " + counter );

            if (true){
                break;
            }
            System.out.println("This string shouldn't be print");
        }

        System.out.println(counter + " - iterations have been done.");
    }
}
