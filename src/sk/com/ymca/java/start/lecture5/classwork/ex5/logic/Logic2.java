package sk.com.ymca.java.start.lecture5.classwork.ex5.logic;

public class Logic2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int x = 3;

        if (a < x){
            if (x < b){
                System.out.println("Number " + x + " is in diapason from " + a + " to " + b);
            }
        }else {
            System.out.println("Number " + x + " is not in diapason from " + a + " to " + b);
        }

        if (a < x && x < b) {
            System.out.println("Number " + x + " is in diapason from " + a + " to " + b);
        } else {
            System.out.println("Number " + x + " is not into diapason from " + a + " to " + b);
        }


        int min;
        // Try how to find a min value between variables(a, b and x)
//       if (a < b && a < x){
//           min = a;
//           System.out.println("Min value is: a = " + min);
//       }else if (b < a && b < x){
//           min = b;
//           System.out.println("Min value is: b = " + min);
//       }else {
//           min = x;
//           System.out.println("Min value is: x = " + min);
//       }

    }
}
