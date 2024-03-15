package sk.com.ymca.java.start.lecture7.classwork.ex6;

public class Logic {

    static boolean and(boolean argument1, boolean argument2){
        return argument1 ^ argument2;
    }

    public static void main(String[] args) {

        boolean arg1 = false;
        boolean arg2 = false;

        boolean result = and(arg1, arg2);
        System.out.println(arg1 + " ^ " + arg2 + " = " + result);
    }
}
