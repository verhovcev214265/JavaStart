package sk.com.ymca.java.start.lecture6.classwork.ex1_While;

public class While {
    public static void main(String[] args) {

        int counter = 0;

        while (counter < 3){
            counter++;
            System.out.println("counter = " + counter);
        }

        System.out.println("The loop has done " + counter + " iterations.");
    }
}
