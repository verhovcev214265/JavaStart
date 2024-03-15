package sk.com.ymca.java.start.lecture5.classwork.ex5.logic;

public class Logic2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int x = 3;

        if (a < x){
            if (x < b){
                System.out.println("Number " + x + " is into diapason from " + a + " to " + b);
            }
        }else {
            System.out.println("Number " + x + " is not into diapason from " + a + " to " + b);
        }

        if (a < x && x < b) {
            System.out.println("Number " + x + " is into diapason from " + a + " to " + b);
        } else {
            System.out.println("Number " + x + " is not into diapason from " + a + " to " + b);
        }

       if (a < b && a < x){
           System.out.println("Min value = " + a);
       }else if (b < a && b < x){
           System.out.println("Min value = " + b);
       }else {
           System.out.println("Min value = " + x);
       }


    }
}
