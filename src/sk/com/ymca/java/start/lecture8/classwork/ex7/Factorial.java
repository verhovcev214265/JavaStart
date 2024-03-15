package sk.com.ymca.java.start.lecture8.classwork.ex7;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Factorial {

    static int recursionFactorial(int n){
       if (n == 1) return 1;

       return n * recursionFactorial(n - 1);
    }

    static int recursionFactorial2(int n){
        if (n != 0 && n != 1){
            return n * recursionFactorial2(n - 1);
        }else {
            return 1;
        }
    }

    static int loopFactorial(int n){
        int result = 1;
        for (int i = n; i > 1 ; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int resultRec = recursionFactorial(input);
        System.out.println(resultRec + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        int resultRec2 = recursionFactorial2(input);
        System.out.println(resultRec2 + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        int resultLoop = loopFactorial(input);
        System.out.println(resultLoop + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);


        sc.close();
    }
}
