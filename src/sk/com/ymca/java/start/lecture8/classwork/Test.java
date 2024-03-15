package sk.com.ymca.java.start.lecture8.classwork;

public class Test {
    static void rec (int number){

        if (number == 0) return;

        System.out.print("(");

        rec(number - 1);

        System.out.print(")");
    }

    static void rec2(int num){
        num--;

        System.out.print("(");

        if (num > 0){
            rec(num);
        }

        System.out.print(")");
    }

    public static void main(String[] args) {

        rec(4);
        rec(4);
    }
}
