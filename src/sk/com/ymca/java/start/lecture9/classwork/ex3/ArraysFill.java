package sk.com.ymca.java.start.lecture9.classwork.ex3;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class ArraysFill {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + ", ");
        }

        // If we need concrete index, we should use 'for'
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        arr[2] = 999;

        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        /*
        If just Output elements from array, better use foreach
        (Type ('into this' element), : arr)
         */
        for (int element : arr){
            System.out.print(element + ", ");
        }
    }
}
