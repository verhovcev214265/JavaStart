package sk.com.ymca.java.start.inevidualpractica.maks.arrays.ex2;

public class Array {
    public static void main(String[] args) {
        int[] vector = new int[1];
        vector[0] = 100;
        System.out.println(vector[0]);

        int[][] matrix = new int[2][4];
        matrix[0][0] = 200;
        matrix[0][1] = 1;

        System.out.print(matrix[0][0] + ", " + matrix[0][1]);
    }
}
