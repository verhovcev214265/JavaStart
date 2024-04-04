package sk.com.ymca.java.start.lecture3.classwork.ex11LocalVariables;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class LocalBlocks {

    public static void main(String[] args) {

        /*
         В коді можно створювати локальні блоки
         і в різних цих блоках зберігати  одноіменні змінні
         */

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
