package sk.com.ymca.java.start.lecture9.classwork.ex1;

public class Arrays {
    public static void main(String[] args) {
        // Initialisations of arrays

        int[] numbers1 = new int[4]; // Java

        int numbers2[] = new int[5]; // C

        // equal initialisations methods of arrays
        int[] numbers3 = new int[]{1, 2, 3, 4, 5, 100};
        int[] numbers4 = {1, 2, 3, 4, 5, 100, 200};

        // How to add elements to array
        numbers1[0] = 100;
        numbers1[1] = 200;
        numbers1[2] = 300;
        numbers1[3] = 400;

        // arrays length
        int length = numbers4.length;
        System.out.println(length);
        System.out.println(numbers2.length);

        // multidimensional array
        int[][] numbers5 = { {1, 2, 3}, {4, 5, 6} };

    }
}
