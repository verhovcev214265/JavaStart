package sk.com.ymca.java.start.lecture4.classwork.ex2_if_else;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class IfElse {
    public static void main(String[] args) {

        int a = 100;
        int b = 22;

        if(a < b){
            System.out.println("'a' less than 'b");
        }else {
            System.out.println("'a' do not less than b");
        }

        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        /*
        Якщо тіло блока if та else складається лише з одного виразу,
        тоді операторні дужки можно не писати
         */

        if(a > b) System.out.println("'a' biggest than 'b");
        else System.out.println("'a' don't biggest than 'b");
    }
}
