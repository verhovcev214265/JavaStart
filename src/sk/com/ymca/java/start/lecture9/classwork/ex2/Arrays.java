package sk.com.ymca.java.start.lecture9.classwork.ex2;

public class Arrays {
    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
//
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
    }
}
