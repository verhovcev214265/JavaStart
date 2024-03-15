package sk.com.ymca.java.start.lecture9.classwork.ex5;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int sizeA = 3;
        int sizeB = 3;

        int[][] numbers = new int[sizeA][sizeB];

        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                numbers[i][j] = (i * j) + 1;
            }
        }

        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println("\n");
        }
    }
}
