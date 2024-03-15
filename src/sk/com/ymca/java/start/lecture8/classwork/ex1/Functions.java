package sk.com.ymca.java.start.lecture8.classwork.ex1;

public class Functions {

    static void function(){
        System.out.println("Hello ");
    }

//    static void function(String str){
//        System.out.println(str);
//    }
//
    static String function(String str){
        return str;
    }

    static String function(String str, boolean bool, int num){
        return str;
    }

    static void function(int number){
        System.out.println(number);
    }

    static void function(double number){
        System.out.println(number);
    }

    static void function(long number, String str){
        System.out.println(number + " " + str);
    }

    static void function(String str, int number){
        System.out.println(str + " " + number);
    }

    public static void main(String[] args) {

        function();
        function("my name is Oleksandr ");
        function(33);
        function(03.05);
        function(8096_775_12_49L, " this is my phone");
        function("My index is: ", 49000);

    }
}
