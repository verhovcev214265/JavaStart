package sk.com.ymca.java.start.lecture9.homework.task3;

/*
Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов.
Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array, второй
аргумент – типа int value. В теле метода реализуйте возможность добавления второго аргумента
метода в массив по индексу 0, при этом длина нового массива, должна увеличиться на 1 элемент, а
элементы получаемого массива в качестве первого аргумента должны скопироваться в новый массив
начиная с индекса 1.
 */

import java.util.Arrays;

public class UserArray {

    public static int[] add (int[] array, int value){

        int[] output = new int[array.length + 1];

        for (int i = 0; i < output.length; i++) {
            if (i == 0){
                output[i] = value;
            }else {
                output[i] = array[i - 1];
            }
        }

        return output;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        int[] output = UserArray.add(numbers, 6);
        System.out.println(Arrays.toString(output));

    }
}
