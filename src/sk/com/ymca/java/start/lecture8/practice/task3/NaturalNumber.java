package sk.com.ymca.java.start.lecture8.practice.task3;

public class NaturalNumber {

    static void fromTo (int number){

        number--;
        System.out.print(number + 1 + " ");

        if (number >= 1){
            fromTo(number);
        }
    }

    public static void main(String[] args) {
        fromTo(5);
    }
}
