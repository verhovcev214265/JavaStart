package sk.com.ymca.java.start.lecture3.classwork.ex11LocalVariables;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class LocalVariables {

    public static void main(String[] args) {

        // В коді можно створювати локальні області і в різних цих областях зберігати одноіменні змінні змінні

        {
            int a = 1;
            System.out.println(a + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
        }

        {
            int a = 2;
            System.out.println(a + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
        }

        int a = 3;
        System.out.println(a + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);


    }
}
