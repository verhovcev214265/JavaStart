package sk.com.ymca.java.start.lecture8.classwork.ex5;

public class SimpleRecursion {

    static void recursion(int counter){
        counter--;

        System.out.println("The first half of the method: " + counter);

        if (counter != 0){
            recursion(counter);
        }

        System.out.println("The second half of the method: " + counter);
    }

    public static void main(String[] args) {
        recursion(3);

    }
}
