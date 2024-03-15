package sk.com.ymca.java.start.lecture8.classwork.ex3;

public class Overload {

    static void operation(){
        operation("Oleksandr", 10, 10.1);
    }

    static void operation(String name){
        operation(name, 10, 10.1);
    }

    static void operation(String name, int age){
        operation(name, age, 23.9);
    }

    static void operation(String operand1, int operand2, double operand3){
        System.out.println(operand1 + ", " + operand2 + ", " + operand3);
    }

    public static void main(String[] args) {

        operation();
        operation("Oleksandr");
        operation("Oleksandr", 33);
        operation("Oleksandr", 33, 03.05);
    }
}
