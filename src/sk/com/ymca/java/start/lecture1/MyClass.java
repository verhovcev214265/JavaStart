package sk.com.ymca.java.start.lecture1;

public class MyClass {

    public static void main(String[] args) {
        int[] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int j = (arr.length - 1); j >= 0; j--) {
            System.out.print(arr[j] + " ");

        }
    }
}











