package sk.com.ymca.java.start.lecture7.classwork.ex7;

public class Compare {

    static String compare(int value1, int value2){
        if (value1 < value2){
            return "Comparison less than";
        }else if (value1 > value2){
            return "Comparison greater than";
        }
        return "Comparison equal";
    }

    static int compare2(int value1, int value2){
        if (value1 < value2){
            return value1;
        }else {
            return value2;
        }
    }

    static int compare3(int value1, int value2){
        return (value1 < value2)? value1 : value2;
    }

    static int compare4(int value1, int value2){
        return Math.min(value1, value2);
    }



    public static void main(String[] args) {

        int value1 = 1;
        int value2 = 2;

        String result = compare(value1, value2);
        System.out.println(result + "\n" + compare2(4,5) + "\n" + compare3(4, 5) + "\n" + compare4(4, 5));


    }
}
