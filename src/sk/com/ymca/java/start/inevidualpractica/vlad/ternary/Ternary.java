package sk.com.ymca.java.start.inevidualpractica.vlad.ternary;

public class Ternary {

    public static int maxValue(int a, int b){

        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static int maxValue2(int a, int b){
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {


    }
}
